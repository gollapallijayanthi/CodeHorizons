class Solution {
    public char kthCharacter(int k) {
        String str="a";
        k++;
        while(str.length()<=k)
        {
            String temp="";
            for(int i=0; i<str.length(); i++)
            {
                
                temp+=Character.toString(str.charAt(i)+1);

            }
           
            str+=temp;
            
        }
        k-=2;
    
        return str.charAt(k);
    }
}