package basic;

import java.util.NoSuchElementException;

/**
 * Created by yueyang on 2016/10/24.
 */
public class Queue<T> {

    private Node<T> first;
    private Node<T> last;
    private int n;

    private static class Node<T> {
        private T item;
        private Node<T> next;
    }

    public Queue() {
        first = null;
        last = null;
        n = 0;
    }

    /**
     * 如果返回为true，表示当前队列为空
     **/
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * 返回n表示列表的长度
     **/
    public int size() {
        return n;
    }

    /**
     * 向队列中插入新元素
     **/
    public void enqueue(T t) {
        Node<T> oldLast = last;
        last = new Node<>();
        last.item = t;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }

        n++;
    }

    /**
     * 删除并返回最顶部的元素
     **/
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T t = first.item;
        first = first.next;
        n--;

        if (isEmpty()) {
            last = null;
        }

        return t;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return first.item;
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        System.out.println("is_empty: " + queue.isEmpty());
        if (queue.isEmpty()) {
            queue.enqueue("hello world");
        }
        System.out.println("is_empty: " + queue.isEmpty());
        if (!queue.isEmpty()) {
            System.out.println("top_queue_is:" + queue.peek());
        }
        queue.dequeue();
        System.out.println("is_empty: " + queue.isEmpty());
    }


}










