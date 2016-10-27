package basic_sort;

import Tools.Tools;

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
            for (int j = i; j > 0 && Tools.less(a[j], a[j - 1]); j--) {
                Tools.exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] a = {4, 2, 5, 1, 3};
        System.out.println(Tools.isSorted(a));
        Insertion.sort(a);
        System.out.println(Tools.isSorted(a));
    }


}
