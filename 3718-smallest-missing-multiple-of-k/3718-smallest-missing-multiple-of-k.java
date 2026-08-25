class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        boolean find = true;
        int multiply = 1;
        while(find){
            int present=k*multiply;
            if(!h.contains(present)){
                return present;
            }
            multiply++;
        }
        return 0;
    }
}