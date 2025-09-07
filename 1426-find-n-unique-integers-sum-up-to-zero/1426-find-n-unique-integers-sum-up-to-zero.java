class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        if(n%2!=0)
        {
            int idx=0;
             res[idx++]=0;
            for(int i=1; i<=n/2; i++)
            {
                res[idx++]=i;
                res[idx++]=-i;
            }
        }
        else
        {
            
            int idx=0;
            for(int i=1; i<=n/2; i++)
            {
                res[idx++]=i;
                res[idx++]=-i;
            }

        }
        return res;
        
    }
}