class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        
        int n=nums.length;
        
       
        ArrayList<Long>arr=new ArrayList<>();

        
     
        
        for(int i=0; i<n; i++){
            long num=nums[i];
            while(arr.size()>=1&&arr.get(arr.size()-1)==num){
                num=num+arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                
            }
            arr.add(num);
        }
        return arr;
        
    }
}