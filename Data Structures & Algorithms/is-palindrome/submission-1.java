class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n = s.length()-1;
        String rev ="";

        for(int i = n; i>=0; i--){
            rev += s.charAt(i);
        }

      return s.equals(rev);
    }
}
