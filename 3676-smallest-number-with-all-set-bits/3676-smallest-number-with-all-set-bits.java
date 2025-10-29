class Solution {
    public boolean isSetNum(int num)
    {
        int temp=num;
        while(temp>0)
        {
            if((temp&1)==0) return false;
            temp=temp>>1;
        }
        return true;
    }
    public int smallestNumber(int n) {
        for(int i=n; ; i++)
        {
            if(isSetNum(i)) return i;
        }
       
    }
}