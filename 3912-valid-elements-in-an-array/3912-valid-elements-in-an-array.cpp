class Solution {
public:
    vector<int> findValidElements(vector<int>& nums) {
        vector<int>prefixleft;
        vector<int>sufixright;
            prefixleft.push_back(nums[0]);
        for(int i=1; i<nums.size(); i++){
            if(nums[i]>prefixleft[i-1]){
                prefixleft.push_back(nums[i]);
            }else{
                prefixleft.push_back(prefixleft[i-1]);
            }
        }
        sufixright.push_back(nums[nums.size()-1]);
        int k=1;
        for(int i=nums.size()-1; i>=0; i--){
            if(nums[i]>sufixright[k-1]){
                    sufixright.push_back(nums[i]);
                    k++;
            }else{
                sufixright.push_back(sufixright[k-1]);
                k++;
            }
        }
        vector<int>res;
        res.push_back(nums[0]);
        reverse(sufixright.begin(),sufixright.end());
        for(int i=1; i<nums.size()-1; i++){
            if(nums[i]>prefixleft[i-1]||nums[i]>sufixright[i+1])
            {
               res.push_back(nums[i]);
            }
        }

       if(nums.size()>=2) res.push_back(nums[nums.size()-1]);
        return res;
    }
};