class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while ( left <= right){
            int middle = (left + right) / 2;
            int number = nums[middle];
            
            if(number == target){
                return middle;
            }
            if(number < target){
                left = middle + 1;
            }
            if(number > target){
                right = middle - 1;
            }
        }
        
        return -1;
    }
}
