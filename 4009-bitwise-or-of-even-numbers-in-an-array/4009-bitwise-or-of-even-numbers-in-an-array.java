class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int res=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]%2==0) res=res|nums[i];
        }
        return res;
    }
}