class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
 
        // Reverse individual rows
        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;
            while (low < high) {
                int t = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = t;
                low++;
                high--;
            }
        }
    }
}
