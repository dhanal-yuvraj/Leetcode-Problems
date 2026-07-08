class Solution {
    public int findMax(int[] arr) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maximum = Math.max(maximum, arr[i]);
        }
        return maximum;
    }

    public long hours(int[] piles, int hour) {
        long totalHrs = 0;

        for (int i = 0; i < piles.length; i++) {
            totalHrs += (piles[i] + (long)hour - 1) / hour;
        }

        return totalHrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = findMax(piles);
        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (hours(piles, mid) <= h) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}