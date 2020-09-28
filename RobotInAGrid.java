import java.util.*;

public class RobotInAGrid {
    static class Point{
        int row;
        int col;
        public Point(int x, int y){
            this.row = x;
            this.col = y;
        }
    }

    public static List<Point> getPathN(int[][] maze){
        if(maze == null || maze.length == 0)
            return null;
        List<Point> result = new LinkedList<>();
        if(getPathStart(maze, 0, 0, result)){
            return result;
        }
        return null;
    }

    public static boolean getPathStart(int[][] maze, int row, int col, List<Point> result){
        if(row >= maze.length || col >= maze[0].length || maze[row][col] == 1)
            return false;
        boolean isEnd = row == maze.length - 1 && col == maze[0].length - 1;
        if(isEnd || getPathStart(maze, row + 1, col, result) || getPathStart(maze, row, col + 1, result)){
            result.add(0, new Point(row, col));
            return true;
        }
        return false;
    }

    public static List<Point> getPathMemo(int[][] maze){
        if(maze == null || maze.length == 0)
            return null;
        List<Point> result = new ArrayList<>();
        Set<Point> failed = new HashSet<>();
        if(getPathMemo(maze, maze.length - 1, maze[0].length - 1, failed, result))
            return result;
        return null;
    }

    public static boolean getPathMemo(int[][] maze, int row, int col, Set<Point> failed, List<Point> result){
        if(row < 0 || col < 0 || maze[row][col] == 1)
            return false;
        Point p = new Point(row, col);
        if(failed.contains(p))
            return false;
        boolean isOrigin = row == 0 && col == 0;
        if(isOrigin || getPathMemo(maze, row - 1, col, failed, result) || getPathMemo(maze, row, col - 1, failed, result)){
            result.add(p);
            return true;
        }
        return false;
    }

    public static List<Point> getPath(int[][] maze){
        if(maze == null || maze.length == 0)
            return null;
        List<Point> result = new ArrayList<>();
        if(getPath(maze, maze.length - 1, maze[0].length - 1, result))
            return result;
        return null;
    }

    public static boolean getPath(int[][] maze, int row, int col, List<Point> result){
        if(row < 0 || col < 0 || maze[row][col] == 1){
            return false;
        }
        boolean isOrigin = row == 0 && col == 0;
        if(isOrigin || getPath(maze, row - 1, col, result) || getPath(maze, row, col -1, result)){
            result.add(new Point(row, col));
            return true;
        }
        return false;
    }
    
}
