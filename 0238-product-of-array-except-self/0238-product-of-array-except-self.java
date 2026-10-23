class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int n = nums.length-1 ;
        int prefix = 1;

        for (int i = 0; i < nums.length; i++) {
           arr[i] = prefix;
            prefix *= nums[i];
             
        }

        int suffix = 1;

        for (int i = n ; i >= 0; i--) {
           arr[i] *= suffix;
            suffix *= nums[i];
             
        }

        return arr;
    }
}