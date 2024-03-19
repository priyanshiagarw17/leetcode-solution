package rotatelist;

public class Solution {

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public ListNode rotateRight(ListNode head, int k) {
            ListNode cur=head;
            if(k==0 || head==null){
                return head;
            }

            int len=0;
            while(cur!=null){
                len++;
                cur=cur.next;
            }
            cur=head;

            k=k%len;
            k=len-k;
            int i=1;
            while(i<k){
                cur=cur.next;
                i++;
            }
            if(cur==null || cur.next==null)
                return head;
            ListNode newhead=cur.next;
            cur.next=null;
            ListNode newcur=newhead;
            while(newcur.next!=null){
                newcur=newcur.next;
            }
            newcur.next=head;
            head=newhead;
            return head;
        }


}
