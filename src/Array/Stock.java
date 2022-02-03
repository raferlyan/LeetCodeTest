package Array;

/**
 * TODO
 * 给定一个数组 prices ，其中prices[i] 表示股票第 i 天的价格。
 *
 * 在每一天，你可能会决定购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以购买它，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润。
 *
 * 示例:
 * 输入: prices = [7,1,5,3,6,4]
 * 输出: 7
 *
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2zsx1/
 * 来源：力扣（LeetCode）
 *
 * @author yjc
 * @date 2022/2/2 18:30
 **/
public class Stock {
    public static void main(String[] args) {

        int[] prices = {1,2,3,4,5};
        maxProfit(prices);
    }

    public static void maxProfit(int[] prices) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] <= prices[i + 1]) {
                count++;
            } else {
                max += prices[i] - prices[i - count];
                count = 0;
            }
        }
        if (count > 0) {
            max += prices[prices.length - 1] - prices[prices.length - 1 - count];
        }
        System.out.println(max);
    }

}
