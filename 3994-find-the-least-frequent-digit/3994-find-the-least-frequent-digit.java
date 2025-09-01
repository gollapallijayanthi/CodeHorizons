class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int temp=n;
        while(temp>0)
        {
            int r=temp%10; 
            temp=temp/10; 
            mp.put(r,mp.getOrDefault(r,0)+1);
        }
        int leastnum=Integer.MAX_VALUE,leastfreq=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer>entry:mp.entrySet())
        {
            int key=entry.getKey(); 
            int val=entry.getValue(); 
            if(val<leastfreq) 
            {
                 leastfreq=val; 
                    leastnum=key; 
                if(leastfreq==val)
                {
                    if(key>leastnum)
                    {
                    leastfreq=val;
                    leastnum=key;
                    }
                }
            }
        }
        return leastnum;
    }
}