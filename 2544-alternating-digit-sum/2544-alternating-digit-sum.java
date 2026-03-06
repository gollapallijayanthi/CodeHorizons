class Solution {
    public int alternateDigitSum(int n) {
        int sum1=0;
        int sum2=0;
        int len=0;
        while(n>0){
            int r=n%10;
            if(len%2==0) sum2+=r;
            else sum1+=r;
            n=n/10;
            len+=1;

        }
        if(len%2==0) return sum1-sum2;
        else return sum2-sum1;
    }
}