class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int[] p=new int[n];
        p[0]=nums[0];
        for(int i=1; i<n; i++){
            p[i]=p[i-1]+nums[i];
        }
        
        int cnt=0;
        for(int i=0; i<n-1; i++){
            int sum=p[n-1]-p[i];
          
         
            if(nums[i]*(n-i-1)>sum)  cnt+=1;
            System.out.print(i);
        }
        return cnt;
    }
}