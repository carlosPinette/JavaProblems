public class SortedMatrixSearch {
   
    public static boolean find(int[][] matrix, int target){
        if(matrix == null || matrix[0].length == 0)
            return false;
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target)
                return true;
            if(matrix[row][col] < target)
                row++;
            else
                col--;
        }
        return false;
    }
}
