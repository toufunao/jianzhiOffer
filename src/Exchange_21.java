public class Exchange_21 {
    public int[] exchange(int[] nums) {
        int len=nums.length;
        if (len==0)
            return nums;

        int left=0;
        int right=len-1;
        while (left<right){
            while (left<right && nums[left]%2!=0)
                left++;

            while (left<right && nums[right]%2==0)
                right--;

            if (left<right){
                int t=nums[left];
                nums[left]=nums[right];
                nums[right]=t;
            }
        }
        return nums;
    }
}
