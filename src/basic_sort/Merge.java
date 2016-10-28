package basic_sort;

import Tools.Tools;

/**
 * 归并排序
 * Created by yueyang on 2016/10/27.
 */
public class Merge {

    public static void sort(Comparable[] a) {
        Comparable[] temp = new Comparable[a.length];
        sort(a, temp, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, Comparable[] temp, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, temp, lo, mid);
        sort(a, temp, mid + 1, hi);
        merge(a, temp, lo, mid, hi);
    }
    
    private static void merge(Comparable[] a, Comparable[] temp, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            temp[k] = a[k];  //将a[] 复制到 temp[]中
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = temp[j++];  //如果左半边取尽，那就取右半边的元素
            } else if (j > hi) {
                a[k] = temp[i++];   //如果右半边取近，那就去左半边的元素
            } else if (Tools.less(temp[j], temp[i])) { //如果第j个元素小于第i个元素，则将第j个元素优先添加到a[]中,下一次比较的是第j+1个元素和第i个元素的大小
                a[k] = temp[j++];
            } else {
                a[k] = temp[i++]; //如果第i个元素小于低j个元素，则将第i个元素添加到a[]中，下一次比较的是第i + 1个元素和第j个元素的大小
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] a = {4, 2, 5, 1, 3};
        System.out.println(Tools.isSorted(a));
        sort(a);
        System.out.println(Tools.isSorted(a));
    }

}
