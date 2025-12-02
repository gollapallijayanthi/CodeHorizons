class Solution {
    public boolean judgeCircle(String moves) {
        int posX=0;
        int posY=0;
        for(int i=0; i<moves.length(); i++)
        {
            char ch=moves.charAt(i);
            if(ch=='U') posX+=1;
            else if(ch=='D') posX-=1;

            if(ch=='L') posY+=1;
            else if(ch=='R') posY-=1;

        }

        if(posX==0&&posY==0) return true;
        else return false;
    }
}