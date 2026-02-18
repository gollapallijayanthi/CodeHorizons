class Solution {
    public boolean hasAlternatingBits(int n) {
        long  num=1;
        long  flag=(num&n)!=0?1:0;
        num=num<<1;
        while(num<=n){
             long curr=(num&n)!=0?1:0;
            if(curr==flag){
                return false;
            }else{
                flag=curr;
                num=num<<1;
            }
        }
        return true;
    }
}