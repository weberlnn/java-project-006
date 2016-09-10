/**
 * Created by lin on 2016/8/11.
 */
/*有了length成员后，就使特定类型的数组操作执行起来更简单、更安全，从而也就简化了许多算法。例如，
下面的程序使用length把一个数组复制到另一个数组当中，并且同时防止了数组溢出及带来的运行时异常。*/
public class ACopy {
    public static void main(String args[]){
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        for(i=0; i < nums1.length; i++)
            nums1[i] =i;
        if(nums2.length >= nums1.length)
            for(i = 0; i < nums1.length; i++)
                nums2[i] = nums1[i];
        for(i=0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");
/*这里length有助于两个功能的执行。第一，它确保目标数组的容量足以存储源数组。第二，它提供了
执行复制的for循环的结束条件。当然，在这个简单的示例中，很容易就可以知道数组的大小，但是这种
方法也可以应用于更广泛、更具挑战性的程序设计中。
         */
    }
}
