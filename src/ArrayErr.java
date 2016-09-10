/**
 * Created by lin on 2016/8/10.
 */
//在java中数组界限是必须遵守的。超出数组范围就会产生一个运行错误。如果你想验证这一点，那么请测试
//下面这个故意使数组溢出的程序。
public class ArrayErr {
    public static void main(String args[]){
        int sample[] = new int[10];
        int i;
        for(i = 0; i < 100; i = i+1);
        sample[i] =i;
    }
}
//一旦i为10，就产生ArrayIndexOutOfBoundsException,而程序也将终止。