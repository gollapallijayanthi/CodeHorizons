class Solution {
public:
    bool areSimilar(vector<vector<int>>& mat, int k) {
      
        int m=mat[0].size();
        vector<vector<int>>final=mat;
        k=k%m;
        for(int i=0; i<mat.size(); i++){
            rotate(mat[i].begin(),mat[i].begin()+k,mat[i].end());
        }
        return final==mat;
    }
};