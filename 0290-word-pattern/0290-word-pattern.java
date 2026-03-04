class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>mp2=new HashMap<>();
        HashMap<String,Character>mp1=new HashMap<>();
       
        String[] arr=s.split(" ");
         if(pattern.length() != arr.length) return false;
        int miniLen=Math.min(arr.length,s.length());
        for(int i=0; i<miniLen; i++){
            String str=arr[i];
            char ch=pattern.charAt(i);
            if(mp1.containsKey(str)){
                if(mp1.get(str)!=ch) return false;
            }else if(mp2.containsKey(ch)){
                if(mp2.get(ch)!=str) return false;
            }else{
                mp1.put(str,ch);
                mp2.put(ch,str);

            }
        }
        return true;

        
        
    }
}