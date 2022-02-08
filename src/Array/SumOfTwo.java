package Array;

import java.util.*;

/**
 * TODO 两数之和
 * <p>
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 *
 * @author raferlyan
 * @date 2022/2/7 8:41
 **/
public class SumOfTwo {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        twoSum(nums, target);
    }

    public static void twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    temp[0] = i;
                    temp[1] = j;
                    System.out.println(Arrays.toString(temp));
                }
            }
        }
    }

    public static void twoSumHasMap(int[] nums, int target){
        Map<Integer, Integer> m = new HashMap<>(2);
        for (int i = 0; i < nums.length; i++) {
            if (m.get(target - nums[i]) != null) {
                System.out.println(Arrays.toString(new int[]{m.get(target - nums[i]), i}));
            }
            m.put(nums[i], i);
        }
        System.out.println(Arrays.toString(new int[]{0, 0}));
    }

}
