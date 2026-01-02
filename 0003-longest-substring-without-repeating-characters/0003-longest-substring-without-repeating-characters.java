class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        int i=0,j=0;
        int n=s.length();
        int res=0;
        while(j<n)
        {
            while(j<n&&(mp.getOrDefault(s.charAt(j),0))==0)
            {
                mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
                res=Math.max(res,mp.size());
                j++;
            }
           if(mp.get(s.charAt(i))>1) mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
           else mp.remove(s.charAt(i));
             res=Math.max(res,mp.size());
            i++;

        }
        return res;
    }
}