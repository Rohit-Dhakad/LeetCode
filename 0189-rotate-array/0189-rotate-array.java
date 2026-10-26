// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n  = nums.length;
//         if(k >= nums.length){
//            k %= n ;
//         }
          
//         int left = 0 ;
//         int right = n -1 ;

//         while(left < right){
//             int temp = nums[left];
//             nums[left] = nums[right] ;
//             nums[right] = temp ;
//             left++ ;
//             right-- ;
//         }

//       int start = 0 ;
//       int end  = k-1 ;
//       while(start < end){
//         int temp = nums[start] ;
//         nums[start] = nums[end] ;
//         nums[end] = temp ;
//         start++;
//         end--;
//       }

//       int p = k ;
//       int e = n-1;

//      while(p < e){
//         int temp = nums[p];
//         nums[p] = nums[e] ;
//         nums[e] = temp;
//         p++;
//         e--;
//              }
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length ;
        k = k % n ;
        reverse(nums, 0 , n-1);
        reverse(nums , 0 , k-1) ;
        reverse(nums  , k , n-1);

    }

    public static void reverse(int[] nums , int left , int right  ){
        
        while(left < right){
            int temp = nums[right] ;
            nums[right] = nums[left] ;
            nums[left] = temp ;
            left++;
            right--;
        }
    }
}
