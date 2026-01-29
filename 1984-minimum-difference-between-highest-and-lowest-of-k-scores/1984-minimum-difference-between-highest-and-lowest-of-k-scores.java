class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(k==1||k==0) return 0;
        int ans=Math.abs(nums[0]-nums[k-1]);
        
       for(int i=0; i<nums.length; i++){

           if(i>=k) ans=Math.min(ans,Math.abs(nums[i]-nums[i-k+1]));
       }
       return ans;
        
    }
}