import java.util.ArrayList;
import java.util.List;

public class ReversePrint_06 {
    int[] ans;
    public int[] reversePrint(ListNode head) {
        int count=0;
        ListNode t=head;
        while (t!=null)
        {
            count++;
            t=t.next;
        }
        ans=new int[count];

        if (head==null)
            return ans;


        add(head,count-1);
        return ans;
    }
    public void add(ListNode next,int count){
        if (next==null)
            return;
        add(next.next,count-1);
        ans[count]=next.val;
    }
}
