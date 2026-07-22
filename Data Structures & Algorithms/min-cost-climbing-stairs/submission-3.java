class Solution {
    int solve(int dp[], int cost[] , int n)
    {
        if( n == 0|| n == 1) return 0;
        if(dp[n] != -1) return dp[n];
        
        
        dp[n] = Math.min(cost[n-1] + solve(dp,cost,n-1), cost[n-2] + solve(dp, cost,n-2));
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {
        
        int dp[] = new int[cost.length + 1];
        Arrays.fill(dp, -1);

        return solve(dp, cost, cost.length);

    }
}
