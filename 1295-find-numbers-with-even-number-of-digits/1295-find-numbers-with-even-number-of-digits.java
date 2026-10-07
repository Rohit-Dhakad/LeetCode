class Solution {
    public int findNumbers(int[] nums) {
        int count = 0 ;
        int even = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            count = 0;
            int temp = nums[i] ;
            while(temp != 0){
                count++;
                temp /=10;
            }
            if(count % 2 ==0){
                even++;
              System.out.println("even number of digits");
            }else{
                System.out.println("odd number of digits");
            }

        }
        return even ;
    }
}