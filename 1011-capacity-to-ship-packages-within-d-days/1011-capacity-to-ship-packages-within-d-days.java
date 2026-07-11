class Solution {

    public int sumOfArray(int arr[]){
        int sum = 0;
        for(int x : arr)
            sum += x;
        return sum;
    }

    public int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int x : arr)
            max = Math.max(max, x);
        return max;
    }

    public int calculate(int arr[], int capacity){
        int days = 1;
        int load = 0;

        for(int x : arr){
            load += x;
            if(load > capacity){
                days++;
                load = x;
            }
        }

        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int left = findMax(weights);
        int right = sumOfArray(weights);
        int ans = right;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(calculate(weights, mid) <= days){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return ans;
    }
}