class Solution {
    public boolean canJump(int[] nums) {
        int MaxV = 0;
        for(int i = 0; i< nums.length; i++){
            if(i > MaxV) return false;
            MaxV =Math.max(MaxV, i+ nums[i]);
        }
        return true;
    }
}
