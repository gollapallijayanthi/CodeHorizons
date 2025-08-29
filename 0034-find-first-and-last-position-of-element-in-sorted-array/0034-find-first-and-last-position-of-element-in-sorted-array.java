class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int index=Arrays.binarySearch(nums,target);
        if(index<0) return new int[] {-1,-1};
        int[] res=new int[2];
        int upperBound=-1,lowerBound=-1;
        int i=index;
        while(i<nums.length)
        {
           if(i+1<n&&nums[i+1]==target) i++;
           else break;
        }
        res[1]=i;
        i=index;
        while(i>0)
        {
         if(i>0&&nums[i-1]==target)   i--;
         else break;
        }
        res[0]=i;
        return res;

        // 1 3 5 7
        // se=9
        // -(4) -1=-5

        
    }
}