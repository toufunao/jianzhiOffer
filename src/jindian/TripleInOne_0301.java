package jindian;

import java.util.Arrays;

public class TripleInOne_0301 {
    int stackSize;
    int[] stack;

    public TripleInOne_0301(int stackSize) {
        this.stackSize = stackSize;
        stack = new int[stackSize * 3];
        Arrays.fill(stack, Integer.MIN_VALUE);
    }

    public void push(int stackNum, int value) {
        int beginIndex = stackNum * stackSize;
        int endIndex = stackNum * stackSize + stackSize - 1;
        for (int i = beginIndex; i <= endIndex; i++) {
            if (stack[i] == Integer.MIN_VALUE){
                stack[i] = value;
                return;
            }
        }
    }

    public int pop(int stackNum) {
        int beginIndex = stackNum * stackSize;
        int endIndex = stackNum * stackSize + stackSize - 1;
        if (stackSize==0||stack[beginIndex] == Integer.MIN_VALUE)
            return -1;

        for (int i = endIndex; i >= beginIndex; i--) {
            if (stack[i] != Integer.MIN_VALUE) {
                int value = stack[i];
                stack[i] = Integer.MIN_VALUE;
                return value;
            }
        }
        return -1;


    }

    public int peek(int stackNum) {
        int beginIndex = stackNum * stackSize;
        int endIndex = stackNum * stackSize + stackSize - 1;
        if (stackSize==0||stack[beginIndex] == Integer.MIN_VALUE)
            return -1;
        else {
            for (int i = endIndex; i >= beginIndex; i--)
                if (stack[i] != Integer.MIN_VALUE)
                    return stack[i];
        }
        return 0;
    }

    public boolean isEmpty(int stackNum) {
        int beginIndex = stackNum * stackSize;
        if (stackSize==0)
            return true;
        return stack[beginIndex] == Integer.MIN_VALUE;
    }
}
