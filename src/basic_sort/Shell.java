package basic_sort;

import Tools.Tools;
import com.sun.javafx.collections.SortHelper;

/**
 * Created by yueyang on 2016/10/27.
 */
public class Shell {

    private Shell() {

    }

    public static void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        while (h < n / 3) h = h * 3 + 1;
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && Tools.less(a[j], a[j - h]); j -= h) {
                    Tools.exch(a, j, j - h);
                }
            }

            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Comparable[] a = {4, 2, 5, 1, 3};
        System.out.println(Tools.isSorted(a));
        Shell.sort(a);
        System.out.println(Tools.isSorted(a));
    }
}
