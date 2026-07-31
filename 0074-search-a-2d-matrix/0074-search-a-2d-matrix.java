class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0;
        int hi = (m*n)-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int pos = matrix[mid/n][mid%n];
            if(pos==target) return true;
            if(pos>target) hi = mid-1;
            else lo = mid+1;
        }
        return false;
    }
}