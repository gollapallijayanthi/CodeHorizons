class Solution {
    public int longestOnes(int[] nums, int k) {
        int len=nums.length;
        int i=0,j=0;
        int res=0;
        int cnt=0;
        while(j<len)
        {
               if(nums[j]==0) cnt++;
                j++;
                 
            while(i<len&&cnt>k)
            {
                if(nums[i]==0) cnt--;
                i++;
                 
            }
            res=Math.max(res,j-i); 

        }
       
        return res;
    }
}