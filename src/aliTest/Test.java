package aliTest;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int x = scanner.nextInt();

        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        HashMap<Character, Integer> char2Int = new HashMap<>();
        char2Int.put('a', 0);
        char2Int.put('b', 1);
        char2Int.put('c', 2);
        char2Int.put('d', 3);
        char2Int.put('e', 4);
        char2Int.put('f', 5);
        char2Int.put('g', 6);
        char2Int.put('h', 7);
        char2Int.put('i', 8);
        char2Int.put('j', 9);
        char2Int.put('k', 10);
        char2Int.put('l', 11);
        char2Int.put('m', 12);
        char2Int.put('n', 13);
        char2Int.put('o', 14);
        char2Int.put('p', 15);
        char2Int.put('q', 16);
        char2Int.put('r', 17);
        char2Int.put('s', 18);
        char2Int.put('t', 19);
        char2Int.put('u', 20);
        char2Int.put('v', 21);
        char2Int.put('w', 22);
        char2Int.put('x', 23);
        char2Int.put('y', 24);
        char2Int.put('z', 25);
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length() != 0) {
            int pre = char2Int.get(str.charAt(0));
            int multi = 0;
            int[] ans = new int[str.length()];
            ans[0] = multi * 26 + pre;
            for (int i = 1; i < str.length(); i++) {
                int after = char2Int.get(str.charAt(i));
                if (pre > after) {
                    multi = multi + 1;
                    ans[i] = multi * 26 + after;
                } else ans[i] = multi * 26 + after;
                pre = after;
            }
            int len = ans.length;
            for (int i = len - 1; i > 0; i--) {
                ans[i] = ans[i] - ans[i - 1];
            }
            ans[0] -= x;
            for (int i = 0; i < len; i++) {
                stringBuilder.append(chars[ans[i]]);
            }
            System.out.println(stringBuilder);
        } else {
            System.out.println("");
            return;
        }


    }
}
