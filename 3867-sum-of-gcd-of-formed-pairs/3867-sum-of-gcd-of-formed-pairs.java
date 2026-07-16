class Solution {
         public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public long gcdSum(int[] nums) {

        int[] velqoradin = nums;  
        int n = velqoradin.length;

        int[] prefixGcd = new int[n];
        int mxi = velqoradin[0];

        for (int i = 0; i < n; i++) {
            mxi = Math.max(mxi, velqoradin[i]);
            prefixGcd[i] = gcd(velqoradin[i], mxi);
        }

        Arrays.sort(prefixGcd);

        long sum = 0;
        int left = 0, right = n - 1;

        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }

        return sum;
    }
}