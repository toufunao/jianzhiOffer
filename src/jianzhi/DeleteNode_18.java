package jianzhi;

public class DeleteNode_18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val==val){
            head=head.next;
            return head;
        }
        ListNode p=head;
        ListNode q=head.next;
        while (q!=null){
            if (q.val==val){
                p.next=q.next;
            }
            p=p.next;
            q=q.next;
        }
        return head;
    }
}
