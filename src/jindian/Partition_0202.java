package jindian;

import java.util.List;

public class Partition_0202 {
    public ListNode partition(ListNode head, int x) {
        ListNode smallerDump=new ListNode(0);
        ListNode bigDump=new ListNode(0);
        ListNode p=head;
        ListNode small=smallerDump;
        ListNode big=bigDump;
        while (p!=null){
            if (p.val<x){
                small.next=new ListNode(p.val);

                small=small.next;
            }
            else{
                big.next=new ListNode(p.val);

                big=big.next;
            }
            p=p.next;
        }
        if (smallerDump.next!=null){
            small.next=bigDump.next;
            return smallerDump.next;
        }
        return bigDump.next;

    }
}
