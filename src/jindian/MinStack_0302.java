package jindian;

import java.util.Stack;

public class MinStack_0302 {
    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack_0302() {
        stack=new Stack<>();
        min=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty())
            min.push(x);
        else if (min.peek()>x)
            min.push(x);
        else
            min.push(min.peek());
    }

    public void pop() {
        if (!stack.isEmpty()){
            stack.pop();
            min.pop();
        }
    }

    public int top() {
        if (!stack.isEmpty())
            return stack.peek();
        return -1;
    }

    public int getMin() {
        if (!min.isEmpty())
            return min.peek();
        return -1;
    }
}
