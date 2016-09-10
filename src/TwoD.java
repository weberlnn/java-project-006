/**
 * Created by lin on 2016/8/10.
 */
//与其他使用逗号来分隔数组的维数的计算机语言不同，java要把每个维分别包含在方括号中。
//下面的实例中，二维数组加载了数值1~12。展示一个二维数组。
public class TwoD {
    public static void main(String args[]){
        int t, i;
        int table[][] = new int[3][4];
        for(t=0; t < 3; ++t) {
            for(i=0; i < 4; ++i) {
                table[t][i] = (t*4)+i+1;
                System.out.print(table[t][i] + " \t "+ " ");
            }
            System.out.println();
        }
    }
}
/*       0  1  2  3         table[0][0]的值为1，table[0][1]的值为2；
                            table[0][3]的值为4，table[2][3]的值为12。
    0    1  2  3  4
    1    5  6  7  8
    2    9  10 11 12    TwoD程序创建的table数组的概念图
 */