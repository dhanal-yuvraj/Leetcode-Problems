class Solution {
    public int isSatisfied(int[] nums, int n){
        int a = 1;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+count<=n){
                count+=nums[i];
            }else{
                a++;
                count = nums[i];
            }
        }
        return a;
    }
    public int maxOfArray(int[] nums){
        int maximum = nums[0];
        for(int i=1;i<nums.length;i++){
            maximum = Integer.max(nums[i],maximum);
        }
        return maximum;
    }
    public int sumOfArray(int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public int splitArray(int[] nums, int k) {
        int low = maxOfArray(nums);
        int high = sumOfArray(nums);
        while(low<=high){
            int mid = (low+high)/2;
            int curr = isSatisfied(nums,mid);
            if(k<curr){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}