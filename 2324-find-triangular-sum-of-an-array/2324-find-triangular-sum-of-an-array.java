class Solution {
    public int[] doJob(int[] nums)
    {
        int[] temp=new int[nums.length-1];
        for(int i=0; i<nums.length-1; i++)
        {
            temp[i]=(nums[i]+nums[i+1])%10;

        }
        return temp;
    }
    public int triangularSum(int[] nums) {
        
        
        while(nums.length>1)
        {
            nums=doJob(nums);
        }
        return nums[0];
    }
}