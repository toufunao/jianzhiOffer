package jianzhi;

public class Merge2SortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //1.递归方式
        if (l1==null)
            return l2;
        if (l2==null)
            return l1;

        if (l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }


        //2.非递归方式
//        if (l1==null)
//            return l2;
//        if (l2==null)
//            return l1;
//
//        jianzhi.ListNode head=new jianzhi.ListNode(0);
//        jianzhi.ListNode p=head;
//        while (l1!=null && l2!=null){
//            if (l1.val<l2.val){
//                p.next=l1;
//                l1=l1.next;
//            }else {
//                p.next=l2;
//                l2=l2.next;
//            }
//            p=p.next;
//        }
//        if (l1==null)
//            p.next=l2;
//        else if (l2==null)
//            p.next=l1;
//
//        return head.next;


    }
}
