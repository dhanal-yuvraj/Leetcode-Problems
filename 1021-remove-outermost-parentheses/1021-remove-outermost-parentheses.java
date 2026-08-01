class Solution {
    public String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==')'){
                counter--;
            }
            if(counter != 0){
                res.append(s.charAt(i));
            }

            if(s.charAt(i)=='('){
                counter++;
            }
        }
        return res.toString();
    }
}