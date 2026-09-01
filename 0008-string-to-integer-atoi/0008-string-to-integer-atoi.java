class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int ans = 0;
        int n = s.length();
        int sign = 1;
        int i=0;
        if(i<n && s.charAt(i)=='-'){
            sign = -1;
            i++;
        }else if(i<n && s.charAt(i)=='+'){
            sign = 1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(ans>Integer.MAX_VALUE/10 ||(ans==Integer.MAX_VALUE/10 && digit>7)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            ans = ans * 10 + digit;
            i++;

        }

        return ans*sign;

    }
}