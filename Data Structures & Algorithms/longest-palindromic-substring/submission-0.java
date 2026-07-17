class Solution {
    public static boolean check(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
        
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = -1;
        String result = "";
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                String ss = s.substring(i,j);
                if(check(ss)){
                        if(ss.length() > maxLen){
                            maxLen = ss.length();
                            result = ss;
                        }
                }
                
            }
        }
        return result;
    }
}
