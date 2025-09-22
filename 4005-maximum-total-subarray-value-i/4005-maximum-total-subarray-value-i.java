class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        long maxi=nums[nums.length-1];
        long mini=nums[0];
        long res=maxi-mini;
        res=res*k;
        return res;
    }
}