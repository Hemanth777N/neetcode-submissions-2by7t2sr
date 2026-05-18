class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int j = s.length() - 1;
        int i = 0;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
        } 
        i++;
        j--;
        }
        return true;
        
    }
}
