class Solution {

    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;

        while(nums.length - 1 > i){
            if(nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
            if(j < nums.length - 1){
                j++;
            } else{
                i++;
                j = i + 1;
            }
        }

        throw new IllegalArgumentException("No solution found");
    }
}
