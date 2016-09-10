/**
 * Created by lin on 2016/8/11.
 */
//因为数组是作为对象实现的，所以每个数组都有一个包含数组元素数量的实例变量length，换句话说
//（length包含了数组的大小）。  使用length数组成员。
public class LengthDemo {
    public static void main(String args[]) {
        int list[] = new int[10];
        int nums[] = { 1, 2, 3 };
        int table[][] = {  //一个变长表
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
/*请特别注意二维数组table使用length的方法。二维数组是数组的数组。因此，应当使用表达式
table.length     它包含了存储在table中的数组的数量，本例中为3。为获取table中每个数组的
长度，需要使用下面这个表达式：table[0].length  本例中，该表达式获取的是第一个数组的长度。
*/      System.out.println("list的长度是 " + list.length);
        System.out.println("nums的长度是 " + nums.length);
        System.out.println("table长度是 " + table.length);
        System.out.println("table[0]的长度是 " + table[0].length);
        System.out.println("table[1]的长度是 " + table[1].length);
        System.out.println("table[2]的长度是 " + table[2].length);
        System.out.println();
        //使用初始化列表长度。
        for(int i=0; i < list.length; i++)
            list[i] = i*i;
        System.out.print("这是list: ");
        //现在使用显示列表的长度。
        for(int i=0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
/*另一点需要注意的是，在lengthDemo中for循环使用了list.length来控制迭代发生的次数。因为每个数组
都有自己的长度，你可以使用这一信息，而无须手动跟踪数组的长度。切记，length的值与实际使用的元素的
数量无关。它包含的是数组可以存储的元素数量。
*/
    }
}
