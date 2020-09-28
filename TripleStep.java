public class TripleStep {
    public static void main(String[] args){
        int n = 5;
        System.out.println(countWays(n));
        System.out.println(countWaysMemo(n, new int[n + 1]));
    }

    public static int countWays(int n){
        if(n < 0)
            return  0;
        if(n == 0)
            return 1;
        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }

    public static int countWaysMemo(int n, int[] memo){
        if(n < 0)
            return 0;
        if(n == 0)
            return 1;
        if(memo[n] != 0)
            return memo[n];
        memo[n] = countWaysMemo(n - 1, memo) + countWaysMemo(n - 2, memo) + countWaysMemo(n - 3, memo);
        return memo[n];
    }
}