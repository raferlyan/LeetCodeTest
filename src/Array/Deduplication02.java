package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * TODO
 *
 * @Description
 * @Author yjc
 * @Date 2022/1/31 13:17
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
