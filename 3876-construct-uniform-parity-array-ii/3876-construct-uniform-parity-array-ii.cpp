class Solution {
public:
    
    bool uniformArray(vector<int>& nums1) {
        int e=0,o=0;
         int mini=INT_MAX;
        for(int i=0; i<nums1.size(); i++){
            if(nums1[i]%2==0) 
            {
                e+=1;
               
                
            }
            else {
                o+=1;
                
               
            }
             mini=min(mini,nums1[i]);
        }
        
        if(o==nums1.size() ) return true;
        if(e==nums1.size()) return true;
        if(mini%2!=0) return true;
        return false;

    }
              
};