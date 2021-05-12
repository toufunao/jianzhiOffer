package jindian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;



public class StackOfPlates_0303 {
    List<Stack<Integer>> stacks;
    int capacity;
    public StackOfPlates_0303(int cap) {
        stacks=new ArrayList<>();
        this.capacity=cap;
    }
    public void push(int val) {
        if (capacity<=0)
            return;
        int size=stacks.size();
        if (stacks.isEmpty()||stacks.get(size-1).size()==capacity){
            Stack<Integer> stack=new Stack<>();
            stack.push(val);
            stacks.add(stack);
            return;
        }
        stacks.get(size-1).push(val);
    }

    public int pop() {
        return popAt(stacks.size()-1);
    }

    public int popAt(int index) {
        if (index<0 || index>=stacks.size())
            return -1;

        Stack<Integer> stack=stacks.get(index);
        if (stack.isEmpty())
            return -1;

        int val=stack.pop();
        if (stack.isEmpty())
            stacks.remove(index);
        return val;
    }
}
