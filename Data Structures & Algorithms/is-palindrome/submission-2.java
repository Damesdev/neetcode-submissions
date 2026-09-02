class Solution {
    public boolean isPalindrome(String s) {
        //remove special characters from string
        String[] strArray = s.replaceAll("[^a-zA-Z0-9]", "").split("");
        //start pointer left and right
        int left = 0;
        int right = strArray.length -1;
        //validate and increment
        System.out.println("s:"+strArray);
        while(left < right){
            System.out.println("left:" + left + ", right:"+right + "length:"+s.length());
            String leftChar = strArray[left];
            String rightChar = strArray[right];
            System.out.println("leftChar:"+leftChar);
            System.out.println("rightChar:"+rightChar);
            if(!leftChar.equalsIgnoreCase(rightChar)){
                return false;
            }
            left++;
            right--;
        }
        //end return true
        return true;
    }
}
