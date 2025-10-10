class Solution {
    public String reverseWords(String s) {
        String[] k=s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(k));
        return String.join(" ",k);
        
    }
}