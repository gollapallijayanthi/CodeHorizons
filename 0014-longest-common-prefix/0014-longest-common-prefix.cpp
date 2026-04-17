class Solution {
public:
   
    string longestCommonPrefix(vector<string>& strs) {

        sort(strs.begin(),strs.end());
        string ans="";
        string mini=strs[0];
        string maxi=strs[strs.size()-1];
        for(int i=0; i<mini.size(); i++)
        {
            if(mini[i]==maxi[i])
            {
                ans+=mini[i];
            }
            else break;
        }
        return ans;
    }
};