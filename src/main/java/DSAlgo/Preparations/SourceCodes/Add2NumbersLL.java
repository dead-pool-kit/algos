package DSAlgo.Preparations.SourceCodes;

import DSAlgo.Preparations.Utils.ListNode;

public class Add2NumbersLL {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode newll = null;
        ListNode head = null;
        int carr = 0;
        while(l1 != null && l2 != null) {
            
            int num = l1.val + l2.val + carr;
            if(head == null){
                head = new ListNode(num%10, null);
                newll = head ;
            }
            else{
                newll.next= new ListNode(num%10, null);
                newll = newll.next;
            }
                
            carr = num/10;
            l1= l1.next;
            l2= l2.next;
        }
        
        while(l1 != null) {
            int num = l1.val + carr;
            newll.next= new ListNode(num%10, null);
            l1= l1.next;
            newll=newll.next;
            carr = num/10;
        }
        while(l2 != null){
            int num = l2.val + carr;
            newll.next= new ListNode(num%10, null);
            l2= l2.next;
            newll=newll.next;
            carr = num/10; 
        }
        
        if(carr == 1) {
             newll.next= new ListNode(1, null);
             newll=newll.next;
        }
        return head;
    }
	
}
