class Solution {
    static boolean caneat(int[] piles,int mid,int h)
    {
        int numOfHrs=0;
        for(int i=0; i<piles.length; i++)
        {
            if(piles[i]<mid)
            {
                numOfHrs+=1;
            }
            else
            {
                numOfHrs+=piles[i]/mid;
                if(piles[i]%mid!=0)
                {
                    numOfHrs+=1;
                }
                
            }
            if(numOfHrs>h) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
       int high = piles[0];
        for (int i = 1; i < piles.length; i++) {
        high = Math.max(high, piles[i]);
        }
        int low=1;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(caneat(piles,mid,h)==true)
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
            
        }
        return low;
    }
}
