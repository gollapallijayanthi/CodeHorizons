class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long[] sumarr = new long[nums.length];
        long[] prodarr = new long[nums.length];
        sumarr[0] = nums[0];
        prodarr[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            sumarr[i] = sumarr[i - 1] + nums[i];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (prodarr[i + 1] > ((long) 1e15 / nums[i])) {
                prodarr[i] =  (long)1e15;
            } else {
                prodarr[i] = prodarr[i + 1] * nums[i];
            }
        }

        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            long sum = (i == 0) ? 0 : sumarr[i - 1];
            long prod = (i == nums.length - 1) ? 1 : prodarr[i + 1];
            if (sum == prod) {
                return i;
            }
        }
        return idx;
    }
}
