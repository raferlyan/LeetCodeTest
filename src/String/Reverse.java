package String;

/**
 * TODO 反转字符串
 * <p>
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * @author raferlyan
 * @date 2022/2/10 14:47
 **/
public class Reverse {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverse.reverseString1(s);
        System.out.println(s);
    }

    /**
     * 双指针
     *
     * @param s
     */
    public void reverseString1(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            swap1(s, left++, right--);
        }
    }

    public void swap1(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    /**
     * 递归
     */
    public void reverseString2(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        reverseStringHelper(s, 0, s.length - 1);

    }

    public void reverseStringHelper(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        reverseStringHelper(s, left + 1, right - 1);
        swap2(s, left, right);
    }

    private void swap2(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
