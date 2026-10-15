// -------------------- brute force approch ------------------

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             int start = i;
//             for (int j = i; j < nums.length; j++) {
//                int end = j;
//                currSum = 0 ;
//                 for (int k = start; k <= end; k++) {
//                     currSum += nums[k];
//                 }
//                 if (maxSum <= currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         return maxSum;
//     }

// }

// ---------------------------------  kadanes algorithym -----------------------


 class Solution {
      public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            currentSum = Math.max(nums[i] ,nums[i] + currentSum);
            maxSum = Math.max(maxSum , currentSum) ;
        }
          return maxSum ;
      }
 }