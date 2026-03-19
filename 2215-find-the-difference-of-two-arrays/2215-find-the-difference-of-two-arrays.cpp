class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        map<int,int>mp1,mp2;
        for(int i=0; i<nums1.size(); i++){
            mp1[nums1[i]]+=1;
        }
        for(int i=0; i<nums2.size(); i++){
            mp2[nums2[i]]+=1;
        }
        vector<vector<int>>res(2);
        for(int i=0; i<nums1.size(); i++){
            if(mp2[nums1[i]]==0&&find(res[0].begin(),res[0].end(),nums1[i])==res[0].end()) res[0].push_back(nums1[i]);
        }
         for(int i=0; i<nums2.size(); i++){
 if(mp1[nums2[i]]==0&&find(res[1].begin(),res[1].end(),nums2[i])==res[1].end()) res[1].push_back(nums2[i]);
        }
        return res;
    }
};