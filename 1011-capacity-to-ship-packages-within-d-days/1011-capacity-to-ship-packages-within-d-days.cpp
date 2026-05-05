class Solution {
public:
    int isEnough(int W, int days, vector<int>& weights){
        int d = 1;  
        int w = 0;

        for(int i = 0; i < weights.size(); i++){
            if(weights[i] > W) return 0; 

            if(w + weights[i] > W){
                d++;
                w = weights[i];
            } else {
                w += weights[i];
            }
        }

        return d <= days ? 1 : 0;
    }

    int shipWithinDays(vector<int>& weights, int days) {

        long sumw=0;
        int maxW=0;
        for(int i=0; i<weights.size(); i++){
            sumw+=weights[i];
            if(weights[i]>maxW) maxW=weights[i];
        }
        int low=0,high=sumw;
    
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isEnough(mid,days,weights)){
                    ans=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            
        }
        return ans;
    }
};