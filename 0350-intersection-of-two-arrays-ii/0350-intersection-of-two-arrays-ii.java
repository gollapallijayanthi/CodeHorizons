class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            mp.put(nums1[i],mp.getOrDefault(nums1[i],0)+1);

        }
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0; i<nums2.length; i++){
            if(mp.getOrDefault(nums2[i],0)>0){
                arr.add(nums2[i]);
                if(mp.get(nums2[i])==1){
                    mp.remove(nums2[i]);
                }else{
                    mp.put(nums2[i],mp.get(nums2[i])-1);
                }
            }
        }
        int[] res=new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            res[i]=arr.get(i);
        }
        return res;
        
    }
}