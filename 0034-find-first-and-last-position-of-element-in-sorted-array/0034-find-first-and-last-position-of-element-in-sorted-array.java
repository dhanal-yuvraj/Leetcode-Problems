class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int first = -1;
        int last = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){    
            int mid = (left+right)/2;
            if(nums[mid]==target){
                first = mid;
            }
            if(nums[mid]>=target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        left = 0;
        right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                last = mid;
            }
            if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return new int[]{first, last};
    }
}