package jianzhi;

public class TwoSum_57 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int sum=nums[left]+nums[right];
            if (sum>target)
                right--;
            else if (sum<target)
                left++;
            else{
                ans[0]=nums[left];
                ans[1]=nums[right];
            }
        }
        return ans;
    }
}
