public class PaintFill {
    /**
     * 
     * Colors [1,2,3]
     * 
     */
    
    public static boolean paintFill(int[][] screen, int row, int col, int newColor){
        if(screen[row][col] == newColor)
            return false;
        return paintFill(screen, row, col, screen[row][col], newColor);
    }

    public static boolean paintFill(int[][] screen, int row, int col, int oldColor, int newColor){
        if(row < 0 || row >= screen.length || col < 0 || col >= screen[0].length)
            return false;
        if(screen[row][col] == oldColor){
            screen[row][col] = newColor;
            int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
            for(int[] dir : dirs){
                paintFill(screen, row + dir[0], col + dir[1], oldColor, newColor);
            }
        }
        return true;
    }
}
