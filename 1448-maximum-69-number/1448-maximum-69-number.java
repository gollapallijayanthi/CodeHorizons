class Solution {
    public int maximum69Number (int num) {
        
        ArrayList<Integer>arr=new ArrayList<>();
        int temp=num;
     
        while(temp!=0)
        {
            int r=temp%10;
          
            arr.add(0,r);
           
            temp=temp/10;

        }
        int first6 = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 6) {
                first6 = i;
                break;
            }
        }
       
       int res = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == first6) res = res * 10 + 9; 
            else res = res * 10 + arr.get(i);
        }
        return res;

    }
}