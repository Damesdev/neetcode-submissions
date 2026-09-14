class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums) {
        var maxCount = 0;
        var currStreak = 0;
        for(var num of nums){
            
            if(num == 1){
                currStreak++;
            } else {
                currStreak = 0;
            }

            if(currStreak > maxCount){
                maxCount = currStreak;
            }
        }
        return maxCount;
    }
}
