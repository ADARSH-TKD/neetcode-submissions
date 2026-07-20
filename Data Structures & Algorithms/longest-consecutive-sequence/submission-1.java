class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        int ans = 0;
        for(int i : s){
            int curr = i;
            int l = 0;
            while(s.contains(curr)){
                curr++;
                l++;
            }
            ans = Math.max(ans,l);
        }
        return ans;
    }
}
