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
public class RotateList {
	public static void main(String [] args) {
		
	}
	
	public ListNode rotateRight(ListNode head, int k) {
		ListNode first=head;
        ListNode secondLast=head;
        ListNode last=head;
        ListNode lenTemp=head;
        ListNode lastOfSeq=head;
        ListNode ans=head;
        
        if (head==null||head.next==null){
            return head;   
        }
        
        int length=0;
        while(lenTemp!=null) {
        	length++;
        	lenTemp=lenTemp.next;
        }
        
        for(int i=0;i<(length-1-(k%length));i++) {
        	secondLast=secondLast.next;
            ans=ans.next;
        }
        for(int j=0;j<length-1;j++){
            last=last.next;
        }
        
        last.next=first;
        ans=ans.next;
        secondLast.next=null;
        return ans;
	}
}
