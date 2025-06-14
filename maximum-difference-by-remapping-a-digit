class Solution {
    public int minMaxDifference(int num) {
        String numstr= Integer.toString(num);
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(char ch='0'; ch<='9'; ch++)
        {
            String newstr=numstr.replace(ch,'9');
            int value=Integer.parseInt(newstr);
            if(maxi<value) maxi=value;
        }
         for(char ch='0'; ch<='9'; ch++)
        {
            String newstr=numstr.replace(ch,'0');
            int value=Integer.parseInt(newstr);
            if(mini>value) mini=value;
        }

        return maxi - mini;
        
    }
}
