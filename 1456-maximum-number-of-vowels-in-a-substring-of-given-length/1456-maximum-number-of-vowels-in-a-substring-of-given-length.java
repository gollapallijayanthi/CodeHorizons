class Solution {
    public int maxVowels(String s, int k) {
        int i = 0, j = 0;
        s = s.toLowerCase();
        int n = s.length();
        int ans = 0;
        int cnt = 0;
        for (i = 0; i < Math.min(k, s.length()); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                cnt++;

        }
        if (n < k)
            return ans;
        j = k;
        ans = Math.max(ans, cnt);
        i = 0;
        while (j < n) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt--;
            }
            i++;

            ch = s.charAt(j);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt++;

            }
            j++;
            ans = Math.max(ans, cnt);

        }
        return ans;

    }
}