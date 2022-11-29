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
public class ReverseNode {
	public static void main(String [] args) {
		//Algorithm For Making This Possible (This Is Some What Hard, But Will Be Understood In Some Amount Of Time)
		//1. First Make An New Node And Make It's Next Linked To The Existing Head
		//2. Than Make The Pointers By Name pre, cur, nex
		//3. Than Follow The Bellow Steps Recursively To Make The Linked List Reverse, For The Specific Nodes, And If The Nodes Are Less In The Amount Than The K Than Stop This Process
				//Algorithm Is As Follow:(We Have To Reverse Existing Linking)
					//cur.next=nex.next
					//nex.next=pre.next
					//pre.next=nex
					//nex=cur.next
	}
	
	public static ListNode reverseKGroup(ListNode head, int k) {
		if(head==null || k==1) {
			return head;
		}
		
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		
		//Pointers
		ListNode cur=dummy;
		ListNode nex=dummy;
		ListNode pre=dummy;
		
		int count=0;
		while(cur.next!=null) {
			cur=cur.next;
			count++;
		}
		while(count>=k) {
			cur=pre.next;
			nex=cur.next;
			for(int i=1;i<k;i++) {
				cur.next=nex.next;
				nex.next=pre.next;
				pre.next=nex;
				nex=cur.next;
			}
			pre=cur;
			count-=k;
		}
		return dummy.next;
	}
}
