
public class WordSearch {

    public static int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    public static void main(String[] args){

    }

    public static boolean exist(char[][] board, String word){
        if(board == null || word == null)
            return false;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(dfs(0, i, j, board, word))
                    return true;
            }
        }
        return false;
    }

    public static boolean dfs(int index, int row, int col, char[][] board, String word){
        if(index == word.length())
            return true;
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || word.charAt(index) != board[row][col])
            return false;
        board[row][col] = '#';
        for(int[] dir : dirs){
            int nRow = row + dir[0];
            int nCol = col + dir[1];
            if(dfs(index + 1, nRow, nCol, board, word))
                return true;
        }
        board[row][col] = word.charAt(index);
        return false;
    }
}
