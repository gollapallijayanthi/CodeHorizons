class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer>ans=new ArrayList<>();
        int n=digits.length;
        int sum=0,carry=1;
        for(int i=n-1; i>=0; i--)
        {
            sum=digits[i];
            sum=sum+carry;
            if(sum<=9) 
            {
                ans.add(sum);
                carry=0;
            }else {
                carry=1;
                ans.add(sum-10);
            }
        }
        if(carry==1) ans.add(carry);
        int[] res=new int[ans.size()];
        
        for(int i=0; i<ans.size(); i++)
        {
            res[i]=ans.get(ans.size()-1-i);
        }

        return res;
        
    }
}