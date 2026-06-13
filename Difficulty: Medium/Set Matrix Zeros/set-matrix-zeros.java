class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int rowIdx[] = new int[n * m];
        int colIdx[] = new int[n * m];
        int idx = 0;

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 0) {
                    rowIdx[idx] = i;
                    colIdx[idx] = j;
                    idx++;
                }
            }
        }

        for(int i = 0; i < idx; i++) {
            int k = rowIdx[i];
            for(int j = 0; j < m; j++) {
                mat[k][j] = 0;
            }
        }

        for(int i = 0; i < idx; i++) {
            int c = colIdx[i];
            for(int j = 0; j < n; j++) {
                mat[j][c] = 0;
            }
        }
    }
}