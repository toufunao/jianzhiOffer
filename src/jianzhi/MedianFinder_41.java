package jianzhi;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder_41 {
    Queue<Integer> max;
    Queue<Integer> min;
    public MedianFinder_41() {
        min=new PriorityQueue<>();
        max=new PriorityQueue<>((x,y)->(y-x));
    }

    public void addNum(int num) {
        if (max.size()!=min.size()){
            min.add(num);
            max.add(min.poll());
        }else {
            max.add(num);
            min.add(max.poll());
        }
    }

    public double findMedian() {
        if (min.size()!=max.size()){
            return min.peek();
        }
        else {
            return (min.peek()+max.peek())/2.0;
        }
    }
}
