/**
 * Created by lin on 2016/8/12.
 */
/*增强型for循环也可以用于多维数组。但是要记住，java中的多维数组是数组的数组，例如，二维数组
是一个一维数组的数组。在遍历多维数组时，这一点很重要，因为每一次迭代获得的都是下一级数组，而
不是单个的元素。而且，for循环的迭代变量必须与获得的数组的类型兼容。例如，对于二维数组，迭代
变量必须是一个一维数组的引用。总之，当使用for-each形式的for循环遍历N维数组时，获得的对象必
须是N-1维。下面的程序使用嵌套的for循环，按照行顺序，从头到尾获得一个二维数组的元素。*/
public class ForEach2 {
    public static void main(String args[]){
        int sum = 0;                     // 在该程序中，要特别注意下面这行语句：
        int nums[][] = new int[3][5];    // for(int x[] : nums) {
        for(int i = 0; i < 3; i++)       // 注意x是如何声明的。它是一个对一维整型数组的
            for(int j = 0; j < 5; j++)   // 引用。这样做是必要的，因为每一次迭代for循环
                nums[i][j] = (i+1)*(j+1);// 都会获得nums中的下一个数组，从nums[0]指定
        for(int x[] : nums) {            // 的数组开始。内层for循环遍历每一个数组，显示
            for(int y : x) {             // 每一个元素的值。
                System.out.println("值是: " + y);
                sum += y;
            }
        }
        System.out.println("总和: " + sum);
    }
}
/*在该程序中，要特别注意这一行语句： for(int x[] : nums) {    注意x是如何声明的。它是一个对一维整数的
引用。这样做是必要的，因为每一次跌代for循环都会获得nums中的下一个数组，从nums[0]指定的数组开始。内层for
循环遍历每一个数组，显示每一个元素的值。 */
