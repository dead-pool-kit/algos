package DSAlgo.Preparations.SourceCodes;

import DSAlgo.Preparations.Utils.ListNode;

public class ReorderLinkedList {

	ListNode myHead= null; 
	
    public void reorderList(ListNode head) {
    	myHead = head;
        llrecursive(head);
    }
    
    private void llrecursive(ListNode tail) {
        if(tail == null) {
            return; 
        }
        
        llrecursive(tail.next);
       
        if(myHead == null)
        	return;
        			
        if(myHead == tail)
        {
        	myHead.next = null;
        	myHead = null;
            return ;
        }   
        else if (myHead.next == tail){
            tail.next = null;
            myHead = null;
            return;
        }
        
        System.out.println("head: " + myHead.val);
        System.out.println("tail: " + tail.val);

        ListNode tmp = myHead.next;
        myHead.next = tail;
        tail.next = tmp;
        myHead= tmp;
    }
    
	
	
}
