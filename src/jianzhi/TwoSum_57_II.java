package jianzhi;

import java.util.ArrayList;
import java.util.List;

public class TwoSum_57_II {
    public int[][] findContinuousSequence(int target) {
        List<int[]> ans=new ArrayList<>();
        int mid=(target+1)/2;
        int right=1;
        int left=1;
        int sum=0;
        while (left<mid){
           if (sum<target){
               sum+=right;
               right++;
           }else if (sum>target){
               sum-=left;
               left++;
           }else {
               int size=right-left;
               int[] res=new int[size];
               for (int i=0;i<size;i++){
                   res[i]=i+left;
               }
               ans.add(res);
               sum-=left;
               left++;
           }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
