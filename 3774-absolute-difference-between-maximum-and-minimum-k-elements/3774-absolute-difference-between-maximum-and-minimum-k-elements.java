class Solution {
    public int absDifference(int[] nums, int k) {
         Arrays.sort(nums);
         int smallestSum = 0;
        int largestSum = 0;
        int n = nums.length;

          for (int i = 0; i < k; i++) {
            smallestSum += nums[i];
        }

        for (int i = n - k; i < n; i++) {
            largestSum += nums[i];
        }

         return Math.abs(largestSum - smallestSum);
    }
}