class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         // Step 1: Count the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store unique elements in a list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort based on frequency (highest first)
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Step 4: Store first k elements in the answer array
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
