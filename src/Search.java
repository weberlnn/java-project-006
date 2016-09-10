/**
 * Created by lin on 2016/8/12.
 */
/*应用增强型for循环：  由于for-each形式的for循环只能以顺序方式从头到尾地遍历数组，因此你可能
会认为它的用法受限。其实情况并非如此。很多算法都需要这种机制。最常见的算法之一就是搜索。例如：
下面的程序使用for循环在一个无序数组中搜索某个值，找到该值之后终止。*/
public class Search {
    public static void main(String args[]) {
        int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 7;
        boolean found = false;
        for(int x: nums) {
            if(x == val) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("值发现!");
    }
}
/*for-each形式的for循环是该情况下的最佳选择，因为搜索无序数组也需要按照顺序检查数组的每一个元素
（如果是有序数组，可以使用二元搜索，这需要不同形式的循环）。其他类型的应用也可以从for-each形式的
for循环受益，包括计算平均值、查找一组值的最大值和最小值、查找重复值等。
 */