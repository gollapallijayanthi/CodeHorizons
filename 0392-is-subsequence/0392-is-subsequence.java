class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1=0,p2=0;
        // int flag=0;
        while(p2<t.length())
        {
            char ch=t.charAt(p2);
            if(p1<s.length()&&ch==s.charAt(p1)){
                p1+=1;
            }
            p2+=1;
        }
        if(p1>=s.length()) return true;
        else return false;
        
    }
}