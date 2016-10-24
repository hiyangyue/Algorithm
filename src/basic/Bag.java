package basic;

/**
 * Created by yueyang on 2016/10/23.
 */
public class Bag<T> {

    private Node<T> first;
    private int n;

    private static class Node<T> {
        private T item;
        private Node<T> next;
    }

    public Bag() {
        first = null;
        n = 0;
    }

    /**
     * [判断背包是否为空]
     * author: yueyang , time: 下午10:25
     **/
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * [返回当前背包的大小]
     * author: yueyang , time: 下午10:25
     **/
    public int size() {
        return n;
    }

    /**
     * [往背包里面添加新的Item]
     * author: yueyang , time: 下午10:25
     **/
    public void addItem(T t) {
        Node<T> oldNode = first;
        first = new Node<T>();
        first.item = t;
        first.next = oldNode;
        n++;
    }

    /**
     * [测试]
     * author: yueyang , time: 下午10:36
     **/
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        System.out.println("is_empty:" + bag.isEmpty() + ",size:" + bag.size());
        if (bag.isEmpty()) {
            String newItem = "hello_world";
            bag.addItem(newItem);
        }

        System.out.println("is_empty:" + bag.isEmpty() + ",size:" + bag.size());
    }
}






















