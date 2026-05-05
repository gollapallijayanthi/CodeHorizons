class Solution {
public:
    string sortVowels(string s) {
        string ans = "";
        map<char,int> mp;
        map<char,int> posmp;

        
        for(int i = 0; i < s.size(); i++){
            char ch = s[i];
            if(isVowel(ch)){
                mp[ch]++;
                if(mp[ch] == 1){
                    posmp[ch] = i;   
                }
            }
        }

      
        vector<pair<int,pair<int,char>>> freq;
        for(auto it : mp){
            freq.push_back({it.second, {posmp[it.first], it.first}});
        }

    
        sort(freq.begin(), freq.end(), [](auto a, auto b){
            if(a.first == b.first)
                return a.second.first < b.second.first;
            return a.first > b.first; 
        });

       
        string newstr = "";
        for(auto it : freq){
            for(int i = 0; i < it.first; i++){
                newstr += it.second.second;
            }
        }

   
        int k = 0;
        for(char ch : s){
            if(isVowel(ch)){
                ans += newstr[k++];
            } else {
                ans += ch;
            }
        }

        return ans;
    }

    bool isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
};