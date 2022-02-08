package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * TODO 加一
 *
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * @author raferlyan
 * @date 2022/2/6 13:24
 **/
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        plusOne(digits);
    }

    public static void plusOne(int[] digits){
        int length = digits.length;
        for (int i = length-1; i >= 0; i--) {
            if (digits[i] != 9){
                digits[i]++;
            }else {
                digits[i] = 0;
            }
        }
        int[] temp = new int[length + 1];
        temp[0] = 1;
        System.out.println(Arrays.toString(temp));

        System.out.println(Arrays.toString(digits));
    }
}
