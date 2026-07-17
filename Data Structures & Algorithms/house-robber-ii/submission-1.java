class Solution {
int solve(int[] nums, int index, int end, int[] dp) {

        // Base Case
        if (index > end)
            return 0;

        // Already solved
        if (dp[index] != -1)
            return dp[index];

        // Option 1: Rob current house
        int rob = nums[index] + solve(nums, index + 2, end, dp);

        // Option 2: Skip current house
        int skip = solve(nums, index + 1, end, dp);

        // Store maximum
        dp[index] = Math.max(rob, skip);

        return dp[index];
    }

    public int rob(int[] nums) {

        int n = nums.length;

        // Edge case: Only one house
        if (n == 1)
            return nums[0];

        // Case 1: Rob houses from 0 to n-2
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = solve(nums, 0, n - 2, dp1);

        // Case 2: Rob houses from 1 to n-1
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = solve(nums, 1, n - 1, dp2);

        return Math.max(case1, case2);
    }
}
