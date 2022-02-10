package Array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * TODO
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false。
 * <p>
 * 输入：nums = [1,2,3,1]
 * 输出：true
 *
 * @author yjc
 * @date 2022/2/3 13:14
 **/
public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        Duplicate duplicate = new Duplicate();
        System.out.println(duplicate.duplicate(nums));
        System.out.println("--------------------");
        System.out.println(duplicate.duplicate01(nums));
        System.out.println("--------------------");
        System.out.println(duplicate.duplicate02(nums));
    }

    /**
     * 此方法效率低，LeetCode会超时
     * @param nums
     */
    public boolean duplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 使用排序比较
     */
    public boolean duplicate01(int[] nums){
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }

    /**
     * 使用Set集合
     */
    public boolean duplicate02(int[] nums){
        HashSet<Integer> temp = new HashSet<>();
        for (int num : nums) {
            if(!temp.add(num)){
                return true;
            }
        }
        return false;
    }
}
