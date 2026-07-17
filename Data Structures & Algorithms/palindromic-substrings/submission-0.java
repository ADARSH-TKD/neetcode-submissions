class Solution {
    public static boolean check(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
        
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int ans =0;

        for(int i =0 ; i< n;i++){
            for(int j = i + 1; j <= n; j++){
                String ss = s.substring(i,j);
                if(check(ss)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
