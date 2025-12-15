class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            res.add(index[i],nums[i]);
        }
        int[] ans=new int[nums.length];
        for(int i=0; i<res.size(); i++)
        {
            ans[i]=res.get(i);
        }
        return ans;
    }
}