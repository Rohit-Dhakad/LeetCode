class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();

        for(int i = 0 ; i < candies.length; i++){
                    boolean greatest = true;
            int num = candies[i] + extraCandies ;
            for(int j = 0 ; j < candies.length ; j++){
                if(num < candies[j]){
                 greatest = false ;
                }
            }
            list.add(greatest);
        }
        return list ;
    }
}