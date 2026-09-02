class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> hm = new HashMap<>();
            hm.put(s.charAt(i),1);
            for(int j=i+1;j<s.length();j++){
                hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j),0)+1);
                int max = Collections.max(hm.values());
                int min = Collections.min(hm.values());
                ans = ans + (max-min);
            }
        }
        return ans;
    }
}