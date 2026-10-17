import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int row = 1; row <= numRows; row++) {
            ans.add(generateRow(row));
        }
        
        return ans;
    }
    
    private List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> rowList = new ArrayList<>();
        rowList.add(1); 
        
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            rowList.add((int) ans);
        }
        
        return rowList;
    }
}
