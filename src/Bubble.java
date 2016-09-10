/**
 * Created by lin on 2016/8/10.
 */
/*冒泡排序法是从其执行排序操作的方法得名的。它使用重复比较多，需要时对数组中的领进元素交换。在
这个过程中，小值移到一端，而大值则移动到另一端。这个过程在概念上与水池中的水泡寻找自己的位置类似。
冒泡排序法的原理就是对数组进行若干次遍历，同时在需要时进行元素交换。遍历的次数比数组中元素总数少1。
 */
public class Bubble {
    public static void main(String args[]) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size;
        size = 10;
        System.out.println("最初的数组:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
        //下面是形成冒泡排序法的核心代码，被排序的数组名为nums。
        for(a=1; a < size; a++)
            for(b=size-1; b >= a; b--) {
                if(nums[b-1] > nums [b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
 /*排序依赖于两个for循环。内部循环用于检查数组中相邻的元素。在每次遍历中，剩余元素的最小值将移至合
 适的元素。在找到顺序不合适的元素对时，就交换两个元素。在每次遍历中，剩余元素的最小值将移至合适的
 位置。外层循环则用于使这一过程不断重复，直到整个数组排序为止。
 */
        System.out.print("分类的数组:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
//尽管冒泡排序对于小型数组是适用的，但是在应用于大型数组时，它的效率就比较低了。