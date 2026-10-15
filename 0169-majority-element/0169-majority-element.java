class Solution {
    public int majorityElement(int[] nums) {
        // ---------------- Brute Force approach ---------------
        // int count = 0;
        // int maxCount = 0;
        // int n = nums.length;
        // int currentElement = 0;
        // int majority = 0;

        // for (int i = 0; i < n; i++) {
        //     currentElement = nums[i];
        //     count = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (currentElement == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if (maxCount < count) {
        //         maxCount = count;
        //         majority = nums[i];
        //     }
        // }
        // return majority;

        // ------------------- optimal solution using boyer-Moore voting algorithym


   
        int candidate = nums[0];
        int count = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    


    }
}