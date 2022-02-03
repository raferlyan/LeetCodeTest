package Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * TODO
 *
 * @Description
 * @Author yjc
 * @Date 2022/1/31 12:49
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
