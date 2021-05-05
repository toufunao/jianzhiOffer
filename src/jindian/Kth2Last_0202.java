package jindian;

/**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值
 */
public class Kth2Last_0202 {
    public int kthToLast(ListNode head, int k) {
        ListNode p=head;
        ListNode q=head;
        for (int i=0;i<k;i++){
            q=q.next;
        }
        while (q!=null){
            p=p.next;
            q=q.next;
        }
        return p.val;
    }
}
