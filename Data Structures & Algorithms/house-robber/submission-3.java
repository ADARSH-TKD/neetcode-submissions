class Solution {
    public int find(int dp[], int nums[],int i){
        if(i >= nums.length ) return 0;
        if(dp[i] != -1) return dp[i];
        dp[i] = Math.max(nums[i] + find(dp,nums,i+2), find(dp,nums,i+1));
        return dp[i];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int i =0;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return find(dp,nums,i);


    }
}
