class Solution {
    public  boolean check(String s, String t){
        int an[]= new int[26];
        if(s.length() != t.length()) return false;
        for(int i =0 ; i< s.length(); i++){
            an[s.charAt(i) - 'a']++;
            an[t.charAt(i) - 'a']--;
        }
        for(int i : an){
            if(i>0) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<>();
        int n = strs.length;
        boolean flag[] = new boolean[n];
        // int i =0;
        for(int i =0 ;i<n; i++){
        if(flag[i] == false){
        List<String> arr2 = new ArrayList<>();
        arr2.add(strs[i]);
        for(int j = i+1; j< n; j++){
            if(flag[j] == false){
                if(check(strs[i], strs[j])){
                arr2.add(strs[j]);
                flag[j] = true;
                }
            }
        } 
        arr.add(arr2);
        flag[i] = true;
        }
        


        }
        return arr;
    }
}
