class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

        }
        int sum=0;
        for(Map.Entry<Integer,Integer>ent:mp.entrySet())
        {
            int key=ent.getKey();
            int val=ent.getValue();
            if(val%k==0) sum+=(key*val);
        }
        return sum;
    }
}