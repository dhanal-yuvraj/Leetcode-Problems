import java.util.Stack;

class Solution {
    public boolean isValid(String S) {

        Stack<Character> s = new Stack<>();

        for (int l = 0; l < S.length(); l++) {

            char ch = S.charAt(l);

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            }

            // Closing brackets
            else {
                if (s.isEmpty()) {
                    return false;
                }

                if (ch == ')' && s.peek() == '(') {
                    s.pop();
                }
                else if (ch == ']' && s.peek() == '[') {
                    s.pop();
                }
                else if (ch == '}' && s.peek() == '{') {
                    s.pop();
                }
                else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }
}