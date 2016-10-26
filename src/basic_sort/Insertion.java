package basic_sort;

/**
 * 插入排序
 * Created by yueyang on 2016/10/26.
 */
public class Insertion {

    private Insertion() {

    }

    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    /**
     * 比较两个元素的大小，true表示元素a小于元素b
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交还第i个元素和第j个元素的位置
     */
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    /**
     * 查看是否已经排序成功
     * 任意两个相邻的元素如果存在递增的关系，则表示整个数组是有序的
     */
    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i <= a.length - 1; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    public static void main(String[] args) {
        Comparable[] a = {4, 2, 5, 1, 3};
        System.out.println(isSorted(a));
        Insertion.sort(a);
        System.out.println(isSorted(a));
    }


}
