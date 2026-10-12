class Solution {
    public int missingNumber(int[] nums) {
        boolean found = true ;
        
        int n = nums.length ;
        int expectedSum = n*(n+1) /2 ;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i] ; 
        }
         int missing = expectedSum - sum ;
        
        return missing ;
    }
}