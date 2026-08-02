class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String str = new StringBuilder(s).reverse().toString();
        for(int i=0; i<str.length();i++){
            String words = "";
            while(i<str.length() && str.charAt(i)!=' '){
                words+=str.charAt(i);
                i++;
            }
            if(words.length()>0){
                ans += " " + new StringBuilder(words).reverse().toString();
            }
        }
        return ans.substring(1);
    }
}