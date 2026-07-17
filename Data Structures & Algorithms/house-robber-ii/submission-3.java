class Solution {
    public int solve(int nums[] , int start, int end , int dp[]){
        if(start > end) return 0;
        if(dp[start] != -1) return dp[start];
        int rod = nums[start] + solve(nums, start+2, end, dp);
        int skip = solve(nums, start+1, end, dp);
        dp[start] = Math.max(rod, skip);
        return dp[start];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n== 1) return nums[0];
        int dp1[] = new int[n+1];
        int dp2[] = new int[n+1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2, -1);

        return Math.max(solve(nums,0,n-2,dp1), solve(nums,1,n-1,dp2));
    }
}