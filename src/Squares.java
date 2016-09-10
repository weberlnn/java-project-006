/**
 * Created by lin on 2016/8/10.
 */
/*val表示一个初始化值。每个内部块指派了一行。在每一行中，第一个值存储在子数组的第一个位置，第二个
值则位于第二个位置，依次类推。注意，初始化块之间要用逗号分隔，而右花括号“}”后面要有分号。
下面的程序用数值1到10以及它们的平方初始化一个名为sqrs的数组。
 */
public class Squares {      //初始化一个二维数组。
    public static void main(String args[]) {
        int sqrs[][] = {
                { 1, 1 },
                { 2, 4 },
                { 3, 9 },
                { 4, 16 },
                { 5, 25 },   //每一行都有自己的初始化设置
                { 6, 36 },
                { 7, 49 },
                { 8, 64 },
                { 9, 81 },
                { 10, 100 }
        };
        int i, j;
        for(i=0; i < 10; i++) {
            for(j=0; j < 2; j++)
                System.out.print(sqrs[i][j] + " ");
            System.out.println();
        }
    }
}
