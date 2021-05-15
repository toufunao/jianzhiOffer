package jianzhi;

import java.util.Deque;
import java.util.LinkedList;

public class MaxWindow_59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length==0 || k==0)
            return new int[0];
        int length=nums.length;
        int size=length-(k-1);
        int[] ans=new int[size];
        Deque<Integer> deque=new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast()<nums[i])
                deque.removeLast();
            deque.add(nums[i]);
        }
        int count=0;
        ans[count]=deque.peekFirst();
        for (int i = k; i <nums.length ; i++) {
            if (deque.peekFirst()==nums[i-k])
                deque.removeFirst();
            while (!deque.isEmpty() && deque.peekLast()<nums[i])
                deque.removeLast();
            deque.addLast(nums[i]);
            count++;
            ans[count]=deque.peekFirst();
        }
        return ans;
    }
}
