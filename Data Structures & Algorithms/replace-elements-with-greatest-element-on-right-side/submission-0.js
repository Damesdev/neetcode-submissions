class Solution {
    /**
     * @param {number[]} arr
     * @return {number[]}
     */
    replaceElements(arr) {
        for(var i = 0; i < arr.length; i ++){
            var maxLeft = -1;
            for(var j = i +1; j < arr.length; j++){
                if(arr[j] > maxLeft){
                    maxLeft = arr[j];
                }
            }
            arr[i] = maxLeft;
        }

        return arr;
    }
}
