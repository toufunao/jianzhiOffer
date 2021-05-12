package jindian;

public class Test {
    public static void main(String[] args){
        MinStack_0302 test=new MinStack_0302();
        test.push(-2);
        test.push(0);
        test.push(-3);
        test.getMin();
        test.pop();
        System.out.println(test.top());
        System.out.println(test.getMin());
    }
}
