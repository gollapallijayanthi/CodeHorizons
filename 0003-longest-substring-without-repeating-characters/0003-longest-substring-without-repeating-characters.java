class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
       
        for(int i=0; i<s.length(); i++)
        {
            HashSet<Character>Hs=new HashSet<>();
            for(int j=i; j<s.length(); j++)
            {
                if(Hs.contains(s.charAt(j)))
                {
                   
                    break;

                }
                else Hs.add(s.charAt(j));
            }
             res=Math.max(res,Hs.size());
        }
        return res;
    }
}