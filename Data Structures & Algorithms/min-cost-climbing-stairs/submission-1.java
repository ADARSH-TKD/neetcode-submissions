class Solution {
    static int min(int dp[], int cost[] , int n){
        if(n == 0 || n == 1) return 0;

        if(dp[n] != -1 ) return dp[n];
        dp[n] = Math.min(min(dp, cost, n-1) + cost[n-1], min(dp, cost, n-2) + cost[n-2]);
        return dp[n];

    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return min(dp,cost,n);
    }
}
