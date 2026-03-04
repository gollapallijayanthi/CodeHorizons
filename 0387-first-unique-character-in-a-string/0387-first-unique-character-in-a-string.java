class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map1 = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        int ans = -1;
        for(int i = 0; i < s.length(); i++) {
            char p = s.charAt(i);
            if(map1.get(p)==1) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}