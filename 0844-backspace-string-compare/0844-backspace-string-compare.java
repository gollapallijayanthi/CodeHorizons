class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character>slist=new ArrayList<>();
        ArrayList<Character>tlist=new ArrayList<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(ch=='#') {
                int len=slist.size();
              if(len!=0)  slist.remove(len-1);
            }
            else slist.add(ch);
            
        }
        for(int i=0; i<t.length(); i++)
        {
            char ch=t.charAt(i);
            if(ch=='#') {
                int len=tlist.size();
               if(len!=0) tlist.remove(len-1);
            }
            else tlist.add(ch);
            
        }

        if(tlist.size()!=slist.size()) return false;
        for(int i=0; i<slist.size(); i++)
        {
            if(slist.get(i)!=tlist.get(i)) return false;
        }
        return true;
    }
}