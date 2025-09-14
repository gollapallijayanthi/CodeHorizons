class Solution {
    public int earliestTime(int[][] tasks) {
        int mini=tasks[0][0]+tasks[0][1];
        for(int i=0; i<tasks.length; i++)
        {
            int srt=tasks[i][0];
            int end=tasks[i][1];
            if(srt+end<=mini) mini=srt+end;
        }
        return mini;
    }
}