class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> freq = new TreeMap<>();

        int n = nums.length;

        // Count frequency of each element
        for (int i = 0; i < n; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        int k = 0;

        // Store unique elements back into nums in sorted order
        for (int key : freq.keySet()) {
            nums[k] = key;
            k++;
        }

        // Return count of unique elements
        return freq.size();
    }
}
