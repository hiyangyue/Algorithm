package basic;

import java.util.NoSuchElementException;

/**
 * 下压栈（动态调整栈的大小）
 * Created by yueyang on 2016/10/25.
 */
public class ResizingArrayStack<E> {

    private E[] items = (E[]) new Object[1];
    private int N;

    /**
     * 动态调整数组的大小
     */
    public void resize(int max) {
        E[] tmp = (E[]) new Object[max];
        for (int i = 0; i < N; i++) {
            tmp[i] = items[i];
        }

        items = tmp;
    }

    /**
     * 向栈里面添加元素
     */
    public void push(E e) {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        if (N == items.length) {
            resize(2 * N); //扩容算法
        }

        items[N++] = e;
    }

    /**
     * 从栈里面移除元素
     */
    public void pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        items[N] = null;
        N --;
        if (N > 0 && N == items.length / 4) {
            resize(N / 2);
        }
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * 返回栈的数量
     */
    public int size() {
        return N;
    }
}
