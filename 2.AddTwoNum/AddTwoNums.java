class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNums {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to simplify code
        ListNode current = dummyHead;
         int carry = 0,x,y;
 
         // Traverse both lists
         while (l1 != null || l2 != null) {
             x = (l1 != null) ? l1.val : 0; // Get the value from l1 if available
             y = (l2 != null) ? l2.val : 0; // Get the value from l2 if available
             int sum = carry + x + y; // Calculate sum with carry
             carry = sum / 10; // Update carry
             current.next = new ListNode(sum % 10); // Create new node with the remainder of sum
             current = current.next; // Move to the next node
 
             // Move to the next nodes in the lists if available
             if (l1 != null) l1 = l1.next;
             if (l2 != null) l2 = l2.next;
         }
 
         // If there's a carry left after the final addition, add it as a new node
         if (carry > 0) {
             current.next = new ListNode(carry);
         }
 
         return dummyHead.next; // Return the actual head of the result list
     }
    public static void main(String args[]){
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); // 342
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // 465
        ListNode result = addTwoNumbers(l1, l2);
        while(result!=null){
            System.out.print(result.val);
            result=result.next;
        }
        
    }
}
