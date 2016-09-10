/**
 * Created by lin on 2016/8/12.
 */
/*对于for-each形式的for循环有一点需要特别注意，它的迭代变量对于内部数组是只读的。赋值给迭代
变量对于内部数组无效。换句话说，不能通过赋给迭代变量新值来修改数组的内容。*/
public class NoChange {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for(int x: nums) {

            System.out.print(x + " ");
          //  x = x * 10;
        }
        System.out.println();
        for(int x : nums)
            System.out.print(x + " ");
        System.out.println();
    }
}
// 第一个for循环试图通过乘以10来增加迭代变量的值，但是这种赋值对于内部数组nums无效。
// 第二个for循环演示了其效果，下面的输出结果证明了这一点。