class Solution {
public:
    bool uniformArray(vector<int>& nums1) {
        int o=0,e=0;
        for(int i=0; i<nums1.size(); i++){
            if(nums1[i]%2!=0) o+=1;
            else e+=1;
        }
        if(o>0||e>0) return true;
        if(o>=2) return true;
        return false;
        
    }
};