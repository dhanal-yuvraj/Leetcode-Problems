class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> current = new ArrayList<>();
            int ans =1;
            current.add(ans);
            for(int j=1;j<i;j++){
                ans = ans*(i-j);
                ans = ans/j;
                current.add(ans);
            }
            result.add(current);
        }
        return result;
    }
}