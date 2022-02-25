package String;

/**
 * TODO 整数反转
 *
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围[−231, 231− 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * @author raferlyan
 * @date 2022/2/14 10:02
 **/
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger integer = new ReverseInteger();
        int x = -123;
        System.out.println(integer.reverse1(x));

    }

    public int reverse1(int x) {
        int res = 0;
        while (x != 0) {
            int t = x % 10;
            int newRes = res * 10 + t;
            //如果数字溢出，直接返回0
            if ((newRes - t) / 10 != res) {
                return 0;
            }
            res = newRes;
            x = x / 10;
        }
        return res;
    }

    public int reverse2(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (int) res == res ? (int) res : 0;
    }
}
