class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int n1 = first.length();
        int n2 = last.length();
        int n = Math.min(n1,n2);
        String ans="";
        for(int i=0;i<n;i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans;
            }
            ans+=first.charAt(i);
        }
        return ans;
    }
}