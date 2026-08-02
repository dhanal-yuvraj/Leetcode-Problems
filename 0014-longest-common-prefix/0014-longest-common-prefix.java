class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];
        int cnt = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==b.charAt(i)){
                cnt++;
            }else{
                break;
            }
        }

        if(cnt > 0){
            return a.substring(0,cnt);
        }else{
            return "";
        }
    }
}