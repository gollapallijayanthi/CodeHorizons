class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        set<vector<int>>res;
        sort(nums.begin(),nums.end());
        for(int i=0; i<nums.size(); i++)
        {
            int l=i+1,r=nums.size()-1;
            while(l<r){

                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    res.insert({nums[i],nums[l],nums[r]});
                    l++;
                }else if(sum>0)
                {
                    r--;

                }else{
                    l++;
                }

            }
        }
        vector<vector<int>>ans(res.begin(),res.end());
        return ans;
    }
};