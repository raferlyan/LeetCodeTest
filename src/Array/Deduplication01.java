package Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * TODO 删除排序数组中的重复项
 *
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * @author yjc
 * @date 2022/1/31 13:17
 **/
public class Deduplication01 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,6};
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i : arr){
            list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i).equals(list.get(i + 1))){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

}
