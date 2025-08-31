class Solution {
    
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res=new int[friends.length];
        int n=friends.length;
        int j=0;
        for(int i=0; i<order.length; i++)
            {
                int index=Arrays.binarySearch(friends,order[i]);
                if(index>=0) res[j++]=order[i];
                if(j==n) break;
            }
        return res;
    }
}