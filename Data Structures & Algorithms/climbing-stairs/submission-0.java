class Solution {
    public static int find(int dp[] , int n ){
        if(n == 1|| n == 0) return 1;
        if(dp[n] != -1)return dp[n];
        dp[n] = find(dp, n-1) + find(dp,n-2);
        return dp[n];
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return find(dp, n);
    }
}
