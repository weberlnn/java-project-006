/**
 * Created by lin on 2016/8/10.
 */
/*在java中，所有的数组都以0作为第一元素的索引。因为sample有10个元素，所以它的索引值就是从0到9。
要索引数组，只需使用方括号指定的元素索引值即可。因此，sample的第一元素是sample[0],最后一个元素是
[9]。     下面的程序是从0到9的数字存储到sample中。
 */
public class ArrayDemo {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;
        for(i = 0; i < 10; i = i+1)
            sample[i] = i;
        for(i = 0; i < 10; i = i+1)
            System.out.println("这是样本[" + i + "]:" + sample[i]);
    }
}
