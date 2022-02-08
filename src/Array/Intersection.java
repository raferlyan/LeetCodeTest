package Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * TODO 两个数组的交集 II
 * 给你两个整数数组 nums1 和 nums2 ，
 * 请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。
 * 可以不考虑输出结果的顺序。
 *
 * @author raferlyan
 * @date 2022/2/5 13:54
 **/
public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {9, 4, 9, 8, 4};
        int[] nums2 = {4, 9, 5};
        intersect(nums1, nums2);
    }

    /**
     * 先对两个数组进行排序，
     */
    public static void intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] == nums2[j]) {
                temp.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }
        }
//        System.out.println(arr);
        int[] arr = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }
        System.out.println(Arrays.toString(arr));

    }

}
