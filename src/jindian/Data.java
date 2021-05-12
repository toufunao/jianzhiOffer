package jindian;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Data {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.next();
        int count = in.nextInt();
        int tmp = 0;
        Set<Integer> set = new HashSet<>();

        int sum=0;

        for (int j = tmp; j < number.length() - 1; j++) {
            if (sum<count){
                if (number.charAt(j) > number.charAt(j + 1)) {
                    System.out.println(j);
                    set.add(j);
                    tmp = j;
                    sum++;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (!set.contains(i)){
                if (number.charAt(i)=='0'){
                    if (!stringBuilder.toString().equals("")){
                        char c=number.charAt(i);
                        stringBuilder.append(c);
                    }
                }else {
                    char c=number.charAt(i);
                    stringBuilder.append(c);
                }
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
