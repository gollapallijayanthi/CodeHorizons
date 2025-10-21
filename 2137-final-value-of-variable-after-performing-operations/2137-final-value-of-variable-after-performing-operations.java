class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String ch : operations) {
            if (ch.charAt(0) == '-' || ch.charAt(2) == '-') {
                ans -= 1;
            } else {
                ans += 1;
            }
        }
        return ans;
    }
}
