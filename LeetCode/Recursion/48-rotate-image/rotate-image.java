class Solution {
    public void rotate(int[][] matrix) {

        int len = matrix.length;
        int[][] copy = new int[len][len];

        for(int i=0; i<len; i++) {
            copy[i] = Arrays.copyOf(matrix[i], len);
        }

        for(int i=0; i<len; i++) {
            for(int j=0; j<len; j++) {

                matrix[j][len-1-i] = copy[i][j];
            }
        }
    }
}