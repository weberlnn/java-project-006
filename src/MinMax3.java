/**
 * Created by lin on 2016/8/16.
 */
public class MinMax3 {
    public static void main(String args[]) {
        double nums[] = {3, 2, 3, 8, 5, 9, 7, 8, 3, 10 };
        double sum = 0;
        double mean =0;
        for(double i : nums) {
            System.out.println("值是：" + i);
            sum += i;
            mean = sum / 10;
        }
        System.out.println("总数是：" + sum);
        System.out.println("平均数是：" + mean);
    }
}
