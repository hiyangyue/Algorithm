package basic;

import java.util.NoSuchElementException;

/**
 * Created by yueyang on 2016/10/24.
 */
public class Stack<E> {

    private int n;
    private Node<E> first;

    private static class Node<E> {
        private E item;
        private Node<E> next;
    }

    private Stack() {
        n = 0;
        first = null;
    }

    /**
     * 向栈里面添加元素
     **/
    public void push(E e) {
        Node<E> oldFirst = first;
        first = new Node<>();
        first.item = e;
        first.next = oldFirst;
        n++;
    }

    /**
     * 删除最近添加的元素
     **/
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        E item = first.item;
        first = first.next;
        n--;
        return item;
    }

    /**
     * 返回最近添加的元素
     **/
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return first.item;
    }

    /**
     * 栈是否为空
     **/
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * 栈的大小
     **/
    public int size() {
        return n;
    }

    /**
     * 测试
     **/
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("stack_size : " + stack.size() + ",isEmpty :" + stack.isEmpty());
        if (stack.isEmpty()) {
            String test = "hello world";
            stack.push(test);
            System.out.println("stack_size : " + stack.size() + ",isEmpty :" + stack.isEmpty());
        }

        stack.pop();
        System.out.println("stack_size : " + stack.size() + ",isEmpty :" + stack.isEmpty());
    }


}
