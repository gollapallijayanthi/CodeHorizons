class Solution {
    public int maxDistinct(String s) {

        int[] arr=new int[26];
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            arr[ch-'a']+=1;

        }
        int ans=0;
        for(int i=0; i<26; i++)
        {
            if(arr[i]>=1) ans+=1;
        }
        return ans;
    }
}