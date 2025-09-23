class Solution {
    public int compareVersion(String version1, String version2) {

    
        ArrayList<Long>arr1=new ArrayList<>();
        ArrayList<Long>arr2=new ArrayList<>();

        long  r=0;
        for(int i=0; i<version1.length(); i++)
        {
            char ch=version1.charAt(i);
            if(ch=='.')
            {
                arr1.add(r);
                r=0;
                continue;


            }
            r=(r*10)+ch-'0';
            
           
        }
         arr1.add(r);
        r=0;
         for(int i=0; i<version2.length(); i++)
        {
            char ch=version2.charAt(i);
            if(ch=='.')
            {
                arr2.add(r);
                r=0;
                continue;


            }
             r=(r*10)+ch-'0';
            
           
        }
             arr2.add(r);
         for(int i=0; i<arr1.size(); i++) System.out.print(arr1.get(i)+" ");
        System.out.println("++++");
        for(int i=0; i<arr2.size(); i++) System.out.print(arr2.get(i)+" ");


      int n = Math.max(arr1.size(), arr2.size());
        for (int i = 0; i < n; i++) {
            long v1 = (i < arr1.size() ? arr1.get(i) : 0);
            long v2 = (i < arr2.size() ? arr2.get(i) : 0);

            if (v1 > v2) return 1;
            if (v1 < v2) return -1;
        }

        return 0;
    }
}