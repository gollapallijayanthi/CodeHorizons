class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {

        vector<vector<int>> temp1;

        sort(intervals.begin(), intervals.end());

        for(int i = 0; i < intervals.size(); i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            if(temp1.empty()) {
                temp1.push_back({start, end});
            }
            else {

                int lastEnd = temp1.back()[1];

                if(start <= lastEnd) {

                    temp1.back()[1] =
                    max(temp1.back()[1], end);

                }
                else {

                    temp1.push_back({start, end});
                }
            }
        }

        return temp1;
    }
};