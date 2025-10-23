class Solution {
public:
    bool hasSameDigits(string s) {
       while(s.size()>=3)
        {
            string temp="";
            for(int i=0; i<s.size()-1; i++ )
            {
                int k1=s[i]-'0';
                int k2=s[i+1]-'0';
                int num=(k1+k2)%10;
                temp+=num+'0';
            }
           
            s=temp;
        }
       
       return s[0]==s[1];
    }
};