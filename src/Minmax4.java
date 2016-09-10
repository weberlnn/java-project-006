import java.util.Scanner;

/**
 * Created by lin on 2016/8/16.
 */
public class Minmax4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double a = 0;
        for(double i=1; i <= 10; i++) {
            System.out.print("请输入第" + i + "个数");
            a = a + in.nextInt();
        }
        System.out.println("平均数为：" + (a / 10));
    }

}
