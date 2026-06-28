class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int prev = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = Math.min(arr[i],prev+1);
            prev = arr[i];
        }
        return arr[arr.length-1];
    }
}