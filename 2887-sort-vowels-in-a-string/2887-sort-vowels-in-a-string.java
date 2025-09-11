class Solution {
    boolean isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        else return false;
    }
    public String sortVowels(String s) {
      ArrayList<Character>arr=new ArrayList<>();
       Solution sol=new Solution();
       for(int i=0; i<s.length(); i++)
       {
                char ch=s.charAt(i);
                if(sol.isVowel(ch))
                {
                        arr.add(ch);
                }
       }
       Collections.sort(arr);
       int len=arr.size()-1;
       int pos=0;
       StringBuffer newstr=new StringBuffer();
       for(int i=0; i<s.length(); i++)
       {
              char ch=s.charAt(i);
        if(sol.isVowel(ch))
        {
            newstr.append(arr.get(pos));
            pos++;
        }
        else
        {
             newstr.append(ch);
        }
       }
       return new String(newstr);
    }
}