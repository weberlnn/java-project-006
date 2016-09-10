/**
 * Created by lin on 2016/8/11.
 */
/*每一次遍历循环，x都自动地获得一个等于nums数组中下一个元素的值，因此，第一次遍历时，x为1，
第二次为2，依次类推。这样做不仅语法简洁流畅了，而且还能够防止溢界错误。
       下面是演示for-each版本的for循环的完整的程序。            */
public class ForEach {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for(int x : nums) {
            System.out.println("值是: " + x);
            sum += x;
        }
        System.out.println("总和是: " + sum);
    }
}
//从这个输出可以看到，for-each形式的for循环会从最低的索引到最高的索引依次遍历数组的全部元素。