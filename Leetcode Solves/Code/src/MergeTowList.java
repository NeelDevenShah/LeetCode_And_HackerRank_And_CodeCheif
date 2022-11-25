
public class MergeTowList {
	public static void main(String [] args)
	{
		
	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode ans=new ListNode();
        ListNode ansPtr=ans;
            while(list1 !=null && list2!=null)
            {
                int a=list1.val;
                int b=list2.val;
        	    if(a>b)
        	    {
        		    ansPtr.next=list2;
        		    ansPtr=ansPtr.next;
                    list2=list2.next;
        	    }
        	    else {
        		    ansPtr.next=list1;
                    ansPtr=ansPtr.next;
        		    list1=list1.next;
        	    }
            }
            while(list1!=null)
            {
                ansPtr.next=list1;
                ansPtr=ansPtr.next;
        		list1=list1.next;
            }
            while(list2!=null)
            {
                ansPtr.next=list2;
        		ansPtr=ansPtr.next;
                list2=list2.next;
            }
        return ans.next;
    }
}
