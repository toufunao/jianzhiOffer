package practice;

import java.util.ArrayList;
import java.util.List;

public class Traverse {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums){
        List<Integer> mediate=new ArrayList<>();
        reverse(nums,mediate);
        return ans;
    }

    public void reverse(int[] nums,List<Integer> list){
        if (list.size()== nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            reverse(nums,list);
            list.remove(list.size()-1);
        }
    }
}
