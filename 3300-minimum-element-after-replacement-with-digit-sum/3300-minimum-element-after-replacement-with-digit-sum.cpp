class Solution {
public:
    static int digitsum(long long n)
    {
        long long s=0;
        while(n!=0)
        {
            int r=n%10;
            s+=r;
            n=n/10;
        }
        return s;
    }
    int minElement(vector<int>& nums) {

        for(int i=0; i<nums.size(); i++)
        {
            
           nums[i]=digitsum(nums[i]);
        }
        int mini=*min_element(nums.begin(),nums.end());
        return mini;
    }
};