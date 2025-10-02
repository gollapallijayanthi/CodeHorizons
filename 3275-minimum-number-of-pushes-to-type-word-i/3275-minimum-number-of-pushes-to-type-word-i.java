class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0; i<word.length(); i++)
        {
            char ch=word.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);

        }
        int res=0;
        int buttoncnt=1;
        for(Map.Entry<Character,Integer>entry:mp.entrySet())
        {
            char key=entry.getKey();
            int val=entry.getValue();
             int pushes=(buttoncnt<=8 ?1:buttoncnt/8);
            if(buttoncnt>8)
            {
               if(buttoncnt%8!=0) pushes+=1;
            }
           

            res=res+(pushes*val);
            buttoncnt+=1;

        }
        return res;
    }
}