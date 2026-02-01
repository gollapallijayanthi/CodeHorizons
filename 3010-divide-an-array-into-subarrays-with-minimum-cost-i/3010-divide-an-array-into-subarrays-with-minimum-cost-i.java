class Solution {
    public int minimumCost(int[] nums) {
        int ans = nums[0];
        int mini1 = Integer.MAX_VALUE;
        int mini2 = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= mini1||nums[i]<=mini2) {
                mini1 = Math.min(mini1,mini2);
                mini2=nums[i];
            }
           
        }
       
         return ans + mini1 + mini2;
    }
}