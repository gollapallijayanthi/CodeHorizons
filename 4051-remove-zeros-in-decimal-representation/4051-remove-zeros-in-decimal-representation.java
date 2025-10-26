class Solution {
    public long removeZeros(long n) {
        String strnum = String.valueOf(n);
        strnum = strnum.replace("0", "");
        return Long.parseLong(strnum);
    }
}
