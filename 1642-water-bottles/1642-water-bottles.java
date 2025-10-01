class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int res=numBottles;
       int rem=res;
       while(rem>=numExchange)
       {
        int r=rem/numExchange;
            res+=r;
            rem=rem%numExchange+r;
       }
       return res;
        
    }
}