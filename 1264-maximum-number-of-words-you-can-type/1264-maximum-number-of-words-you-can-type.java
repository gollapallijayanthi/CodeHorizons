class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashMap<Character,Integer>brokenLetMap=new HashMap<>();
        for(int i=0; i<brokenLetters.length(); i++)
        {
            char ch=brokenLetters.charAt(i);
            brokenLetMap.put(ch,brokenLetMap.getOrDefault(ch,0)+1);
        }
        int res=0;
        String[] words=text.split(" ");
        for(int i=0; i<words.length; i++)
        {
            int flag=0;
            for(int j=0; j<words[i].length(); j++)
            {
                char ch=words[i].charAt(j);
                if(brokenLetMap.get(ch)!=null) {
                    flag=1;
                    break;
                }
            }
            if(flag==0) res+=1;

        }
        return res;
    }
}