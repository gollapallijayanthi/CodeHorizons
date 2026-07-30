class Solution {
public:
    void generateCombi(map<char,vector<char>>&mp,int ind, string curr,string &digits,vector<string>&res){
        if(curr.length() == digits.length()){
            res.push_back(curr);
            return;
        }
        for(char ch : mp[digits[ind]]){
            curr+=ch;
            generateCombi(mp,ind+1,curr,digits,res);
            curr.pop_back();
        }
        
    }
    
    vector<string> letterCombinations(string digits) {

        map<char,vector<char>>mp;
        string curr = "";
        vector<string>res;
        mp['2']={'a','b','c'};
        mp['3']={'d','e','f'};
        mp['4']={'g','h','i'};
        mp['5']={'j','k','l'};
        mp['6']={'m','n','o'};
        mp['7']={'p','q','r','s'};
        mp['8']={'t','u','v'};
        mp['9']={'w','x','y','z'};

        generateCombi(mp,0,curr,digits,res);
        return res;
              
    }
};