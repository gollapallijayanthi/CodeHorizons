class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer>arr=new ArrayList<>();
        int temp=n;
        int curr=1;
        while(temp>0)
        {
            int r=temp%10;
            int val=r*curr;
           if(val>0) arr.add(val);
            curr*=10;
            temp=temp/10;
            
        }
        int l=arr.size();
      
        int res[]=new int[l];
        int idx=l-1;
        for(int i=0; i<l; i++)
        {
            res[i]=arr.get(idx);
            idx-=1;
        }
        
        
        return res;
    }
}