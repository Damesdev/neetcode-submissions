class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> seen = new ArrayList<Integer>(nums.length);
        for(int i = 0; i < nums.length; i++){
            if(seen.contains(nums[i])){
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }

}
