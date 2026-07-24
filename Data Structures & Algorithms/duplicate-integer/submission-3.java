class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        for(Integer number : nums) {
            if(seen.contains(number)){
                return true;
            }
            seen.add(number);
        }
        return false;
    }

}
