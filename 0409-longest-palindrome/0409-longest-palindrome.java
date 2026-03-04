import java.util.*;

class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0) + 1);
        }

        int ans = 0;
        boolean oddFound = false;

        for(Map.Entry<Character,Integer> it : mp.entrySet()){
            int val = it.getValue();

            if(val % 2 == 0){
                ans += val;
            }else{
                ans += val - 1;
                oddFound = true;
            }
        }

        if(oddFound)
            ans += 1;

        return ans;
    }
}