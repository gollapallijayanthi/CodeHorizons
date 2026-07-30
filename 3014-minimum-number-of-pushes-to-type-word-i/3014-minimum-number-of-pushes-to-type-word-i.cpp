#include<iostream>
#include<map>
class Solution {
public:
    int minimumPushes(string word) {
        
        map<char,int>mp;
        for(char ch:word){
            mp[ch]+=1;

        }
        int cnt=0,inc=1,res=0;
        for(auto it:mp){
            cnt += 1;
            res += (it.second*inc);
            if(cnt == 8) 
            {
                inc+=1;
                cnt = 0;

            }
        }
        return res;
    }
};