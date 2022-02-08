package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * TODO 删除排序数组中的重复项
 *
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。处。
 * @author yjc
 * @date 2022/1/31 13:17
 **/
public class Deduplication02 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,5,5,6};


        removeDuplicates(nums);

    }
    public static void removeDuplicates(int[] nums) {

        if(nums.length == 0 || nums == null){
            System.out.println(0);
        }
        int a = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[a] != nums[i]){
                a++;
                nums[a] = nums[i];
            }
        }
        System.out.println(a + 1);
    }
}
