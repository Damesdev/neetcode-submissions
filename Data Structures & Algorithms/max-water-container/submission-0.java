class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            for(int j = i+1; j < heights.length; j++){
                int lowestWall = getLowerWall(heights[i], heights[j]);
                int distance = j - i;
                int area = lowestWall * distance;
                if ( area > maxArea ) {
                    maxArea = area;
                }
            }  
        }
        return maxArea;
    }

    public int getLowerWall(int wall1, int wall2){
        if (wall1 < wall2) {
            return wall1;
        }
        return wall2;
    }
}
