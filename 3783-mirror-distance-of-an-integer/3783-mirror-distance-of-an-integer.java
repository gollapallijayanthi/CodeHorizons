class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int rev=0;
        while(num>0)
        {
            int r=num%10;
            rev=rev*10+r;
            num=num/10;

        }
        return Math.abs(n-rev);
    }
}