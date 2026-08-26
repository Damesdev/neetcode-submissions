class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                if(matrix[row][column]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
