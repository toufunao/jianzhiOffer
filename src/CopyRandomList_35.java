public class CopyRandomList_35 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Node cur=head;
        //1.拼接链表
        while (cur!=null){
            Node tmp=new Node(cur.val);
            tmp.next=cur.next;
            cur.next=tmp;
            cur=tmp.next;
        }
        //2.构建random指向
        cur=head;
        while (cur!=null){
            if (cur.random!=null)
                cur.next.random=cur.random.next;
            cur=cur.next.next;
        }

        //3.拆分两个链表
        cur=head.next;
        Node pre=head, res=head.next;
        while (cur.next!=null){
            pre.next=pre.next.next;
            cur.next=cur.next.next;
            pre=pre.next;
            cur=cur.next;
        }
        pre.next=null;
        return res;

    }
}
