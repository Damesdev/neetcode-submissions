class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = nums[0];

        while(left<=right){
            if(nums[left] < nums[right]){
                min = Math.min(nums[left], min);
                break;
            }

            int mid = left + (right - left) / 2;
            min = Math.min(nums[mid], min);

            if(nums[mid] >= nums[left]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return min;
    }
}
