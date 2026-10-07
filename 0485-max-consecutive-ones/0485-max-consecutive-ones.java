class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0 ;
        int maxCount =Integer.MIN_VALUE ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                currCount++ ;
            }else{
                currCount = 0 ;
            }
            if(currCount > maxCount){
                maxCount = currCount ;
            }
        }
        return maxCount ;
    }
}