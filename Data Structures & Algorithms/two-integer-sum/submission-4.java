class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int left = 0; left < nums.length; left++){
            for(int right = left + 1; right < nums.length; right++){
                if(nums[left] + nums[right] == target){
                    return new int[]{left,right};
                }
            }
        }
        return null;
    }
}
