package jianzhi;

public class Search_53_I {
    public int search(int[] nums, int target) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target)
                count++;
        }
        return count;
    }
}
