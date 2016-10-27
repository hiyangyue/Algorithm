package basic_sort;

import Tools.Tools;

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
                if (Tools.less(a[j], a[min])) min = j;
            }
            Tools.exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        Comparable[] a = {4, 2, 5, 1, 3};
        System.out.println(Tools.isSorted(a));
        Selection.sort(a);
        System.out.println(Tools.isSorted(a));
    }
}
