class Solution {
public:
    void rotateMat(vector<vector<int>>&mat){
        for(int i=0; i<mat.size(); i++){
            for(int j=i+1; j<mat.size(); j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i = 0; i < mat.size(); i++){
            reverse(mat[i].begin(),mat[i].end());
        }
    }
    bool findRotation(vector<vector<int>>& mat, vector<vector<int>>& target) {

        int n = 0;
        while(n<=3){
            if(mat==target) return true;
            else {
                if(n<=3) rotateMat(mat);
            }
            n++;
        }
         if(mat==target) return true;
         else  return false;
    }
};