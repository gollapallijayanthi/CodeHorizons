class Solution {
    public int bitwiseComplement(int n) {
        String str=Integer.toBinaryString(n);
        int ans=0;
        int place=str.length()-1;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
                if(ch=='0'){
                    ans=ans+(int)Math.pow(2,place);
                }
               
                place-=1;

        }
        return ans;
        
    }
}