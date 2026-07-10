class Solution {
    public int maxElement(int[] arr){
        int maximum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            maximum = Math.max(maximum, arr[i]);
        }
        return maximum;
    }
    public int HourEating(int piles[], int hour){
        int totalSum = 0;
        for(int i=0; i<piles.length;i++){
            totalSum += Math.ceil((double)piles[i]/hour);
        }
        return totalSum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = maxElement(piles);
        while(left<=right){
            int mid = (left+right)/2;
            int totalHrs = HourEating(piles, mid);
            if(totalHrs<=h){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}