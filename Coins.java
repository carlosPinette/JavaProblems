public class Coins {

    public static void main(String[] args){
        System.out.println(coinsWays(275));
    }

    public static int coinsWays(int n){
        int[] coins = {25,10,5};
        if(n < 0)
            return -1;
        int[] dp = new int[n + 1];
        for(int i = 1; i <= n; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int c : coins){
                if(c <= i && dp[i - c] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                }
            }
        }
        return dp[n] != Integer.MAX_VALUE ? dp[n] : -1;
    }
    
}
