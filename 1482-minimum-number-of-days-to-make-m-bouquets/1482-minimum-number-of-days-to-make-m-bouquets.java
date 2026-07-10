class Solution {
    public int minimum(int[] arr){
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            minimum = Math.min(minimum, arr[i]);
        }
        return minimum;
    }
    public int maximum(int[] arr){
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maximum = Math.max(maximum,arr[i]);
        }
        return maximum;
    }

    public boolean isPossible(int[] bloomDay, int value, int m, int k){
        int count = 0;
        int total = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=value){
                count++;
            }else{
                total+=count/k;
                count = 0;
            }
        }
        total+=count/k;

        if(total>=m){
            return true;
        }else{
            return false;
        }
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int left = minimum(bloomDay);
        int right = maximum(bloomDay);
        int ans = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(isPossible(bloomDay, mid, m, k)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}