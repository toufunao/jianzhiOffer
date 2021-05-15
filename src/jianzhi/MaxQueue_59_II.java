package jianzhi;

import java.util.Deque;
import java.util.LinkedList;

public class MaxQueue_59_II {
    Deque<Integer> ans,max;
    public MaxQueue_59_II() {
        ans=new LinkedList<>();
        max=new LinkedList<>();
    }

    public int max_value() {
        if (max.isEmpty())
            return -1;
        return max.peekFirst();
    }

    public void push_back(int value) {
        ans.addLast(value);
        while (!max.isEmpty() && max.peekLast()<value)
            max.removeLast();
        max.addLast(value);
    }

    public int pop_front() {
        if (ans.isEmpty())
            return -1;
        int t=ans.peekFirst();
        if (t==max.peekFirst())
            max.removeFirst();
        ans.removeFirst();
        return t;
    }
}
