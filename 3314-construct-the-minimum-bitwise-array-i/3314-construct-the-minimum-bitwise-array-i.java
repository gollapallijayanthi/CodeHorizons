class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res=new int[nums.size()];
        for(int i=0;  i<nums.size(); i++)
        {
            int flag=0;
            for(int j=1; j<nums.get(i); j++)
            {
                if((j|(j+1))==nums.get(i))
                {
                    res[i]=j;
                    flag=1;
                    break;
                }
            }
            if(flag==0) res[i]=-1;
        }

        return res;
    }
}