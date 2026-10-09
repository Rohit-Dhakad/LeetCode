class Solution {
    public boolean isPowerOfTwo(int n) {
        int a = n & (n-1) ;
        if(n > 0 && a == 0){
            return true ;
        }
        return false ;
    }
}