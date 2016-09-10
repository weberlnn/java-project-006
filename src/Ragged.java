/**
 * Created by lin on 2016/8/10.
 */
/*编写一个程序用于存储航班搭称人数。如果航班周一至周五每天飞行10次，而周六、周日则是每天两次，可以使用下面
程序所示的riders数组来存储信息。注意对于第一维前五项的第二维长度是10，而第一维后两项的第二维长度为2。*/
 //手动分配不同大小第二维度。
public class Ragged {
    public static void main(String args[]){
        int riders[][] = new int[10][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];
        int i, j;
        // 制造一些假的数据。
        for(i=0; i < 5; i++)
            for(j=0; j < 10; j++)
                riders[i][j] = i + j +10;
        for(i=5; i < 7; i++)
            for(j=0; j < 2; j++)
                riders[i][j] = i + j + 10;
        System.out.println("Riders per trip during the week:");
        for(i=0; i < 5; i++){
            for(j=0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        System.out.println("Riders per trip on the weekend:");
        for(i=5; i < 7; i++){
            for(j=0; j < 2; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
    }
}
/* 在大多数的应用程序当中并不推荐使用不规则的（或不整齐的）多维数组，因为当人们遇到多维数组时，其运行方式
与人们所期望的往往相反。然而，在某些情况下使用不规则数组效率却非常高*/