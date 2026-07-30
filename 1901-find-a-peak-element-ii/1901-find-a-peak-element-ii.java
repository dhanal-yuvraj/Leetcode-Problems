class Solution {
    public int maxElement(int mat[][], int col){
        int maximum = Integer.MIN_VALUE;
        int idx = -1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]>maximum){
                maximum = mat[i][col];
                idx = i; 
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length;
        while(low<=high){
            int mid = (low+high)/2;
            int row = maxElement(mat,mid);
            int left = mid-1>=0 ? mat[row][mid-1]:-1;
            int right = mid+1<mat[0].length ? mat[row][mid+1] : -1;
            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row, mid};
            } else if(mat[row][mid]<left){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}