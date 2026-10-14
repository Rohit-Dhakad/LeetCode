class Solution {
    public boolean isPalindrome(String s) {
        String p = s.toLowerCase();
        String newStr = "" ;
        
          for(int i = 0 ; i < p.length(); i++){
            if(Character.isLetterOrDigit(p.charAt(i))){
                newStr += p.charAt(i);
            }
          }

          int n = newStr.length();

        for(int i = 0 ; i < newStr.length()/2 ; i++){
            if( newStr.charAt(i) != newStr.charAt(n-1-i)){
                return false ;
            }
        }
        return true ;
    }
}