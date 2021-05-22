package test;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteMItem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int loopNum = sc.nextInt();
        for(int i = 0; i< loopNum; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String str = sc.next();
            LinkedList<Character> stack = new LinkedList<>();
            LinkedList<Character> delete = new LinkedList<>();
            for (char s : str.toCharArray()) {
                while (stack.size() > 0 && delete.size() < m && s < stack.peekLast()) {
                    delete.add(stack.pollLast());
                }
                stack.add(s);
            }
            StringBuilder resStr = new StringBuilder();
            for (char s : stack) {
                resStr.append(s);
            }
            String res = resStr.toString();
            if (delete.size() < m) {
                res = res.substring(0, res.length() - (m - delete.size()));
            }
            System.out.println(res);
        }
    }
}
