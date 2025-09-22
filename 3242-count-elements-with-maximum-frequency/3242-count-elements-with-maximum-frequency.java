class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int maxi=0;
        for(int i=0; i<nums.length; i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(maxi<mp.get(nums[i])) maxi=mp.get(nums[i]);
        }
        int res=0;
        for(Map.Entry<Integer,Integer>entr:mp.entrySet())
        {
            int num=entr.getKey();
            int frq=entr.getValue();
            if(frq==maxi) res+=frq;
        }
        return res;

        
    }
}