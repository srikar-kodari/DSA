class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;      //TC: log2(n x m)
        int m = matrix[0].length;   //SC: O(1). Did not use any extra space

        int low = 0;
        int high = (n * m) - 1;

        while(low <= high) {
            int mid = (low + high)/2;

            int row = mid / m;      //Compute ROW
            int column = mid % m;   //Compute COLUMN

            if(matrix[row][column] == target) return true;

            else if(matrix[row][column] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
        
    }
}