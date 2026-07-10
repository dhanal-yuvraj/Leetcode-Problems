class Solution {
    public int findMax(int nums[]){
        int maximum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            maximum = Math.max(maximum, nums[i]);
        }
        return maximum;
    }
    public int findCurrValue(int nums[], int value){
        int sum = 0;
        for(int i=0;i<nums.length; i++){
            sum+=Math.ceil((double)nums[i]/value);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = findMax(nums);
        int ans = right;
        while(left<=right){
            int mid = (left+right)/2;
            if(findCurrValue(nums,mid)<=threshold){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}