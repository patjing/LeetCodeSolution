public class MergeTwoSortedListV2 
{
	public class ListNode 
	{
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
    	if(l1==null)
    	{
    		return l2;
    	}
    	else if(l2 == null)
    	{
    		return l1;
    	}
    	ListNode temp = new ListNode(0);
    	ListNode result = temp;
    	boolean init = false;
    	
    	while(l1!=null&&l2!=null)
    	{
    		if(l1.val > l2.val)
    		{
    			temp.next = l2;
    			l2 = l2.next;
    		}
    		else
    		{
    			temp.next = l1;
    			l1 = l1.next;
    		}
    		temp = temp.next;
    		if(!init)
    		{
    			result = temp;
                init = true;
    		}
    	}
    	
    	if(l1==null)
    	{
    		temp.next = l2;
    	}
    	else
    	{
    		temp.next = l1;
    	}
    	
        return result;
    }
}
