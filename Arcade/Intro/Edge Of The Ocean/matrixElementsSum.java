int matrixElementsSum(int[][] matrix) {
    int result = 0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            boolean flag = true;
            for (int k = i; (k >= 0) && (flag == true); k--) {
                if (matrix[k][j] == 0){
                    flag = false;
                }
            }
            result += flag ? matrix[i][j] : 0;
            
        }
    }
    return result;
}
