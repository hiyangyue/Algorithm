package basic_sort;

/**
 * 选择排序
 * Created by yueyang on 2016/10/26.
 */
public class Selection {

    /**
     * 选择排序
     */
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    /**
     * 查看是否已经排序成功
     * 任意两个相邻的元素如果存在递增的关系，则表示整个数组是有序的
     */
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i <= a.length - 1; i++) {
            if (less(a[i], a[i - 1])) return false;
        }

        return true;
    }

    /**
     * 比较两个元素的大小，true表示元素a小于元素b
     */
    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void main(String[] args) {
        Comparable[] a = {4, 2, 5, 1, 3};
        System.out.println(isSorted(a));
        Selection.sort(a);
        System.out.println(isSorted(a));
    }
}
