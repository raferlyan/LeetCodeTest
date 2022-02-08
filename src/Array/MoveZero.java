package Array;

import java.util.Arrays;

/**
 * TODO 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 * @author raferlyan
 * @date 2022/2/6 19:24
 **/
public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {0, 0, 1};
//        int[] nums = {0};

        moveZero2(nums);
    }

    /**
     * 把非0的往前挪
     * @param nums
     */
    public static void moveZero(int[] nums) {
        int index = 0;
        // 一次遍历，把非零的都往前挪
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        // 后面的都是0,
        while (index < nums.length) {
            nums[index++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 使用双指针
     * @param nums
     */
    public static void moveZero2(int[] nums){
        // 统计前面0的个数
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // 如果当前数字是0就不操作
            if (nums[j] == 0) {
                i++;
            } else if (i != 0) {
                // 否则，把当前数字放到最前面那个0的位置，然后再把
                // 当前位置设为0
                nums[j - i] = nums[j];
                nums[j] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
