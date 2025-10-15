class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0; i<numbers.length; i++)
        {
            int req=target-numbers[i];
            if(mp.containsKey(req))
            {
                return new int[] {mp.get(req)+1,i+1};
            }
            else
            {
               mp.put(numbers[i],i);
            }
        }
        int[] res=new int[2];
        return res;
    }
}