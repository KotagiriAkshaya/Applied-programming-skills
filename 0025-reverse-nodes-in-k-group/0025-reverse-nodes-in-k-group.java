class Solution {
    ListNode reverseKGroup(ListNode List,int k) {

        ListNode temp = new ListNode(-1);
        temp.next = List;

        ListNode Prevgend = temp;

        while (true){

            ListNode kth = Prevgend;

            for(int i=1; i <= k && kth != null; i++)
                kth = kth.next;

            if(kth == null)
                break;
            ListNode gstart = Prevgend.next;
            ListNode nextgstart = kth.next;

            ListNode current,prev,nextnode;

            prev = nextgstart;
            current = gstart;

            while (current!=nextgstart){

                nextnode = current.next;
                current.next=prev;
                prev=current;
                current=nextnode;
            }

            Prevgend.next=kth;
            Prevgend=gstart;
         }
         
         return temp.next;
        } 
    }