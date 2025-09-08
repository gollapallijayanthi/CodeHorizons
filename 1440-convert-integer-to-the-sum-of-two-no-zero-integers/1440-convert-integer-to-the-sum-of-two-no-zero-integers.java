class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res=new int[2];
        for(int i=1; i<n; i++)
        {
            int a=i;
            int b=n-i;
            if(!String.valueOf(a).contains("0")&&!String.valueOf(b).contains("0"))
             {
                
                res[0]=a;
                res[1]=b;
                break;
            }
        }
        return res;
    }
}