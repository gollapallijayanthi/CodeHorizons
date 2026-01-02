class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       
        for(Map.Entry<Integer,Integer>it:mp.entrySet())
        {
          int val=it.getValue();
          if(val==n) return it.getKey();   
        }

        return -1;
        
    }
}