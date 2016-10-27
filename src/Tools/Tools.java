package Tools;

/**
 * Created by yueyang on 2016/10/27.
 */
public class Tools {

    /**
     * 比较两个元素的大小，true表示元素a小于元素b
     */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交还第i个元素和第j个元素的位置
     */
    public static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    /**
     * 查看是否已经排序成功
     * 任意两个相邻的元素如果存在递增的关系，则表示整个数组是有序的
     */
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i <= a.length - 1; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

}
