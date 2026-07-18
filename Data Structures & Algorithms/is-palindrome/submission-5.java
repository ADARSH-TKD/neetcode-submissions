class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^a-zA-Z0-9]","");
        ss = ss.toLowerCase();
        int i =0 ;
        int j = ss.length()-1;
        while(i < j){
            
            if(ss.charAt(i) != (ss.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
