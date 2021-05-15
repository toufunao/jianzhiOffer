package jianzhi;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.HashSet;
import java.util.Set;

public class Straight_61 {
    public boolean isStraight(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=0;
        int min=14;
        for (int num: nums) {
            if (num==0)
                continue;
            max= Math.max(max,num);
            min=Math.min(min,num);
            if (set.contains(num))
                return false;
            set.add(num);
        }
        return max-min<5;
    }
}
