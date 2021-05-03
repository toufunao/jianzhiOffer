package jianzhi;

import java.util.Stack;

public class StackSequence_31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int i=0;

        for (int item:pushed){
            stack.push(item);
            while (!stack.isEmpty() && stack.peek()==popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
