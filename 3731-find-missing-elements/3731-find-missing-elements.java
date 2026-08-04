class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];

        for(int i=0;i<nums.length;i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            h.add(nums[i]);
        }


        for(int i=min;i<=max;i++){
            if(!h.contains(i)){
                ans.add(i);
            }
        }

        return ans;


    }
}