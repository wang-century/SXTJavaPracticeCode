package part7.lesson142;

/**
 * 自定义实现LinkedList
 */

public class MyLinkedList<E> {

    private Node first;
    private Node last;

    private int size;


    public void add(int index, E element) {   //alt+shift+R

        checkRange(index);

        Node newNode = new Node(element);
        Node temp = getNode(index);

        if (temp != null) {
            Node up = temp.previous;

            up.next = newNode;
            newNode.previous = up;

            newNode.next = temp;
            temp.previous = newNode;

        }


    }


    public void remove(int index) {

        checkRange(index);

        Node temp = getNode(index);

        if (temp != null) {
            Node up = temp.previous;
            Node down = temp.next;

            if (up != null) {
                up.next = down;
            }

            if (down != null) {
                down.previous = up;
            }

            //被删除的元素是第一个元素时
            if (index == 0) {
                first = down;
            }

            //被删除的元素是最后一个元素时
            if (index == size - 1) {
                last = up;
            }

            size--;
        }

    }

    //[]
    //["a","b","c","d","e","f"]           2
    public E get(int index) {

        checkRange(index);

        Node temp = getNode(index);

        return temp != null ? (E) temp.data : null;
    }

    private void checkRange(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引数字不合法:" + index);
        }
    }


    private Node getNode(int index) {

        checkRange(index);

        Node temp = null;

        if (index <= (size >> 1)) {   //size>>1相当于除以2
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.previous;
            }
        }

        return temp;
    }


    public void add(E element) {
        Node node = new Node(element);

        if (first == null) {
//			node.previous = null;
//			node.next = null;
            first = node;
            last = node;
        } else {

            node.previous = last;
            node.next = null;

            last.next = node;
            last = node;

        }

        size++;


    }

    @Override
    public String toString() {
        //[a,b,c]     first=a,    last=c
        //a,b,c
        StringBuilder sb = new StringBuilder("[");
        Node temp = first;
        while (temp != null) {
            sb.append(temp.data + ",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length() - 1, ']');

        return sb.toString();
    }

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        System.out.println(list);
        System.out.println(list.get(1));
    }

}

class Node {
    Node previous;  // 上一节点
    Node next;  // 下一节点
    Object data;    // 节点数据

    public Node(Node previous, Node next, Object data) {
        this.previous = previous;
        this.next = next;
        this.data = data;
    }

    public Node(Object data) {
        this.data = data;
    }
}

