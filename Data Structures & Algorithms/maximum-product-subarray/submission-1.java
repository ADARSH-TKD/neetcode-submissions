class Solution {
    public int maxProduct(int[] nums) {
        int sf = 1;
        int pf = 1;
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i< n; i++){
            if(sf == 0) {
                sf =1;
            }
            if(pf == 0) {
                pf = 1;
            }
            sf *= nums[i];
            pf *= nums[n-i-1];
            ans =Math.max(ans, Math.max(sf,pf));

        }
        return ans;
    }
}
