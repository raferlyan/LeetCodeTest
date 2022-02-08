package Array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * TODO
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 实例：
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * @author yjc
 * @date 2022/2/4 10:10
 **/
public class OnlyOne {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        onlyone(nums);
    }

    /**
     * 异或运算
     * <p>
     * a^a=0；自己和自己异或等于0
     * <p>
     * a^0=a；任何数字和0异或还等于他自己
     * <p>
     * a^b^c=a^c^b；异或运算具有交换律
     */
    public static void onlyone(int[] nums) {
        int temp = 0;
        for (int i : nums) {
            temp ^= i;
        }
        System.out.println(temp);
    }

    /**
     * 使用Set集合：
     * 我们遍历数组中的元素，然后在一个个添加到集合Set中，如果添加失败，说明以前添加过，就把他给移除掉。
     * 当我们把数组中的所有元素都遍历完的时候，集合Set中只会有一个元素，这个就是我们要求的值。
     */
    public static void setOnlyOne(int[] nums) {
        HashSet<Integer> temp = new HashSet<>();
        for (int i : nums) {
            if (!temp.add(i)) {
                temp.remove(i);
            }
        }
        System.out.println(temp.toArray()[0]);
    }

}
