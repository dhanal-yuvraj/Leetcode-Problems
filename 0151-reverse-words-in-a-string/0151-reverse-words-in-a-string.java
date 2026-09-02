class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reverse = new StringBuilder();
        for (int i = words.length - 1; i > 0; i--) {
            reverse.append(words[i]).append(" ");
        }
        return reverse.append(words[0]).toString();
    }
}