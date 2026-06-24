/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        //Get the length
        int listSize = lists.length;
        System.out.println("ListSize:"+ listSize);

        //if lengthn is less than 2 return
        if(listSize < 2){
            return listSize == 1 ? lists[0] : null;
        }
        //Get the beginning to middle of lists
        int middle = listSize / 2;
        ListNode[] leftList = new ListNode[middle];
        ListNode[] rightList = new ListNode[listSize - middle];
        
        //Repeat splitting of both lists
        for(int i = 0; i < middle; i++){
            leftList[i] = lists[i];
        }

        //Repeat splitting of both lists pt 2
        for(int i = middle; i < listSize; i++){
            rightList[i-middle] = lists[i];
        }

        ListNode left = mergeKLists(leftList);
        ListNode right = mergeKLists(rightList);

        //return merge left and right into original
        return merge(left, right);

    }

    private ListNode merge(ListNode left, ListNode right ){
        //Create head (result) for pointer, and then current
        ListNode result = new ListNode();
        ListNode resultCurrent = result;
        //iterate through both starting from the first to end
        while(right != null && left != null){
            // System.out.println("LeftCurrent:"+ left);
            // System.out.println("RightCurrent:"+ right);
            // System.out.println("resultCurrent:"+ resultCurrent);
            // System.out.println("result"+ result);
            if(left.val < right.val){
                resultCurrent.next = left;
                left = left.next;
            } else {
                resultCurrent.next = right;
                right = right.next;
            }
            resultCurrent = resultCurrent.next;
        }
        //if one is longer finish off that array
        while(right != null){
            resultCurrent.next = right;
            right = right.next;
            resultCurrent = resultCurrent.next;
        }

        while(left != null){
            resultCurrent.next = left;
            left = left.next;
            resultCurrent = resultCurrent.next;
        }

        return result.next;
    }
}
