package test;

import java.util.Scanner;

public class Ratio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int pub = find(a, b);
        a = a / pub;
        b = b / pub;
        int x = A / a;
        int y = B / b;
        int t = x > y ? y : x;
        System.out.println(t * a + " " + t * b);
    }

    public static int find(int m, int n) {
        int result = 0;
        while (n != 0) {
            result = m % n;
            m = n;
            n = result;
        }
        return m;
    }
}
