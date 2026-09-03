class Solution {

    public boolean uniformArray(int[] nums) {

        boolean allEven = true;
        boolean allOdd = true;

        int minEven = Integer.MAX_VALUE;
        int minOdd = Integer.MAX_VALUE;

        for (int x : nums) {
            if (x % 2 == 0) {
                minEven = Math.min(minEven, x);
            } else {
                minOdd = Math.min(minOdd, x);
            }
        }

        for (int x : nums) {

            // Can this element become even?
            if (x % 2 != 0) {
                // odd - odd = even
                if (minOdd >= x) {
                    allEven = false;
                }
            }

            // Can this element become odd?
            if (x % 2 == 0) {
                // even - odd = odd
                if (minOdd >= x) {
                    allOdd = false;
                }
            }
        }

        return allEven || allOdd;
    }
}