class Solution {
    public boolean isPalindrome(String s) {
        //remove the special characters from string
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);

        int left = 0, right = s.length() - 1;
        //let pointer left start at 0 and right at StringArray.size()-1
        while (left < right) {


        // while left < right check if left and right are equal if false return false
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }


        // end iterated through and never returned false return true
        return true;
    }
}
