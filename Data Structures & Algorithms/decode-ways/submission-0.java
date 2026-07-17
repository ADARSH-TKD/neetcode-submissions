class Solution {
    int solve(String s, int index, int[] dp) {
        // Reached the end
        if (index == s.length())
            return 1;

        // Starts with 0 -> invalid
        if (s.charAt(index) == '0')
            return 0;

        // Already solved
        if (dp[index] != -1)
            return dp[index];

        // Take one digit
        int ways = solve(s, index + 1, dp);

        // Take two digits if valid
        if (index + 1 < s.length()) {

            int num = (s.charAt(index) - '0') * 10
                    + (s.charAt(index + 1) - '0');

            if (num >= 10 && num <= 26)
                ways += solve(s, index + 2, dp);
        }

        dp[index] = ways;

        return ways;
    }
    public int numDecodings(String s) {
        int n = s.length();
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(s,0,dp);
    }
}
