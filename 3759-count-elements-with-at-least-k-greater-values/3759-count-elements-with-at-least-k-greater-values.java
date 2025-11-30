import java.util.*;

class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        if (k == 0) return n; 

        TreeMap<Integer, Integer> mp = new TreeMap<>();

        for (int x : nums) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        int ans = 0;
        int greater = 0; 

       
        for (Map.Entry<Integer, Integer> entry : mp.descendingMap().entrySet()) {
            int val = entry.getKey();
            int freq = entry.getValue();

            
            if (greater >= k) {
                ans += freq;  
            }

           
            greater += freq;
        }

        return ans;
    }
}
