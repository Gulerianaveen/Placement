class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Deserialize the input to a linked list
        ListNode head = ListNode.deserialize("[1,2,3,4,5]"); // Change input as needed
        
        ListNode middle = solution.middleNode(head);
        System.out.println("Middle Node: " + middle.val);
    }
}
