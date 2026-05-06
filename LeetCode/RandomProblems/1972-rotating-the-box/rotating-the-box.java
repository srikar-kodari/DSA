class Solution {
    public char[][] rotateTheBox(char[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m; i++) {

            int pointer = n-1;
            for(int j=n-1; j>=0; j--) {

                if(matrix[i][j] == '*') pointer = j-1;

                else if(matrix[i][j] == '#') {
                    char temp = matrix[i][j];
                    matrix[i][j] = matrix[i][pointer];
                    matrix[i][pointer] = temp;

                    pointer--;
                }
            }
        }

        char[][] result = new char[n][m];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                result[j][m-1-i] = matrix[i][j];
            }
        }

        return result;
    }
}
