package jianzhi;

import javax.management.Query;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ConcatMinValue_45 {
    public String minNumber(int[] nums) {
        Queue<String> min=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        for (int num:nums) {
            min.add(""+num);
        }

        StringBuilder stringBuilder=new StringBuilder();
        while (!min.isEmpty()){
            stringBuilder.append(min.poll());
        }
        return stringBuilder.toString();
    }
}
