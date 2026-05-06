class Solution {
public:
    int countDays(int days, vector<vector<int>>& meetings) {
       
        sort(meetings.begin(),meetings.end());
        long ans=0;
        long maxii=0;
       maxii = max(maxii, (long)max(meetings[0][0], meetings[0][1]));
        long mini=days;
          mini=min(mini,(long)min(meetings[0][0],meetings[0][1]));
        for(long i=1; i<meetings.size(); i++){
            
            long prevstart=meetings[i-1][0];
            long prevend=meetings[i-1][1];
            long start=meetings[i][0];
            long end=meetings[i][1];
           
           if(start>maxii) 
           {
               cout<<prevend<<"-"<<start<<" "<<ans;
               ans+=start-maxii-1;
           }
             maxii=max(maxii,(long)max(meetings[i][0],meetings[i][1]));
            mini=min(mini,(long)min(meetings[i][0],meetings[i][1]));
            
        }
        if(mini!=1) ans+=mini-1;
        if(maxii<=days) ans+=days-maxii;
        return ans;
        
    }
};