class Solution {
    boolean isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        else return false;
    }
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int maxiFreqVowel=0;
        int maxiFreqConsonent=0;
        for(Map.Entry<Character,Integer>entry:mp.entrySet()){
            char ch=entry.getKey();
            int freq=entry.getValue();
            if(isVowel(ch))
            {
                if(maxiFreqVowel<freq) maxiFreqVowel=freq;

            }else{
                if(maxiFreqConsonent<freq) maxiFreqConsonent=freq;
            }

        }
        return maxiFreqVowel+maxiFreqConsonent;
    }
}