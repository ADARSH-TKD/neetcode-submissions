class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^a-zA-Z0-9]","");
       ss = ss.toLowerCase();
       StringBuilder sb = new StringBuilder(ss);
       sb.reverse();
       String ne = sb.toString();
        return ne.equals(ss);

    }
}
