class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > maximum) {
                maximum = nums[i];
                maxIndex = i;
            }

            if (nums[i] < minimum) {
                minimum = nums[i];
                minIndex = i;
            }
        }

        int left = Math.min(maxIndex, minIndex);
        int right = Math.max(maxIndex, minIndex);

        int rightSide = right+1;
        int leftSide = n-left;
        int bothSide = (left+1)+(n-right);


        int ans = Math.min(rightSide,Math.min(leftSide, bothSide));
        return ans;
    }
}