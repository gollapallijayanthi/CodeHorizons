class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

         Arrays.sort(nums);
        int[] res;
        int cnt=0;
        LinkedHashSet<Integer>s=new LinkedHashSet<>();
       for(int i=nums.length-1; i>=0; i--)
       {
            s.add(nums[i]);
            if(s.size()==k) break;
       }
       if(s.size()<=k)
       {
        res=new int[s.size()];
             for(int n:s)
            {
            res[cnt]=n;
            cnt++;
        
            }

       }else
       {
         res=new int[k];
         for(int n:s)
        {
            res[cnt]=n;
            cnt++;
            if(cnt>=3) break;
        }

       }
        

        return res;

        
    }
}