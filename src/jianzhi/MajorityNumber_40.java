package jianzhi;

import java.util.Arrays;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 *
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */

public class MajorityNumber_40 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        for (int i=0;i<len;i++){
            if (nums[i+len/2]==nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }
}
