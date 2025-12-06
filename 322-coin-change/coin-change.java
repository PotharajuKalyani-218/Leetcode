/*class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<=0)
            return 0;
        int dp[]=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int coin:coins){
            for(int j=coin;j<=amount;j++){
                if(dp[j-coin]!=Integer.MAX_VALUE){
                    dp[j]=1+dp[j-coin];
                }
            }
        }
        if(dp[amount]== Integer.MAX_VALUE)
            return -1;
        return dp[amount];

    }
}*/
import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount < 0) return -1; // Handle negative amounts immediately
        if (amount == 0) return 0;

        // Initialize DP array with amount+1 (representing infinity/impossible)
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0; // Base case: 0 coins needed for 0 amount

        // Iterate through each coin
        for (int coin : coins) {
            // Iterate through all amounts from the coin value up to the target amount
            for (int j = coin; j <= amount; j++) {
                // If a solution for the smaller subproblem (j-coin) exists
                if (dp[j - coin] != amount + 1) {
                    // Update dp[j] with the minimum of its current value 
                    // or 1 (the current coin) + the solution for dp[j-coin]
                    dp[j] = Math.min(dp[j], 1 + dp[j - coin]);
                }
            }
        }

        // If dp[amount] is still amount+1, it means the amount cannot be formed
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
