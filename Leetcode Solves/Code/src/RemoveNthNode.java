
public class RemoveNthNode {
	//Main class Cannot Be Maked, Only Sample Code of function is below, Cannot be runned in this file
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        ListNode first = dummy;
	        ListNode second = dummy;
	        
	        
	        for (int i = 0; i < n + 1; i++) {
	            first = first.next;
	        }
	        while (first != null) {
	            first = first.next;
	            second = second.next;
	        }
	        second.next = second.next.next;
	        return dummy.next;
	    }
}
