/**
 * Created by lin on 2016/8/10.
 */
/*与其他对象相似，当把一个数组引用变量赋给另一个变量时，只需要修改一下变量引用的对象即可。既没有
生成数组的副本，也没有使一个数组的内容复制到另一个数组中。考虑下面这个程序：
 */     //分配数组引用变量
public class AssignARef {
    public static void main(String args[]) {
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for(i = 0; i < 10; i++)
            nums1[i] = i;

        for(i = 0; i < 10; i++)
            nums2[i] =-i;

        System.out.print("这是nums1: ");
        for(i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
        System.out.print("这是nums2:");
        for(i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();
        nums2 = nums1;  //现在nums2指nums1。     赋值数组引用
        System.out.print("这是nums2后赋值: ");
        for(i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();
        //现在操作通过nums2 nums1数组。
        nums2[3] = 99;    //在把nums1赋值给nums2后，两个数组引用变量都指向了同一个对象。
        System.out.print("这是通过nums2 nums1后改变: ");
        for(i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
    }
}
