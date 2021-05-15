package jianzhi;

public class Search_53_II {
    public int missingNumber(int[] nums) {
        if (nums[0]!=0)
            return 0;
        for (int i = 1; i < nums.length; i++) {
            int t=nums[i-1]+1;
            if (nums[i]!=t)
                return t;
        }
        return nums[nums.length-1]+1;
    }
}
