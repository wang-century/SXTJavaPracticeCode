package part7.lesson142;

/**
 * 自定义实现LinkedList
 */
public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
        myLinkedList.add("d");
        myLinkedList.add("e");
        myLinkedList.add("f");
        myLinkedList.add("g");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(1));
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.remove(4);
        System.out.println(myLinkedList);
    }
}

class MyLinkedList {
    private Node first;
    private Node last;
    private int size;

    public void add(Object obj) {
        Node node = new Node(obj);
        // 第一次放元素
        if (first == null) {
            first = node;
            last = node;
        } else {
            node.previous = last;   // 新节点的上一个元素是添加前的最后一个元素
            last.next = node;   // 添加前的最后一个元素的下一个元素设置为新节点
            last = node;    // 最后一个元素设置为新节点
        }
        size++;
    }

    @Override
    public String toString() {
        // 遍历链表
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Node currentNode = first;
        // 空链表直接返回
        if (currentNode.data == null) {
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        // 非空链表遍历一遍
        stringBuilder.append(currentNode.data).append(",");
        while (currentNode.next != null) {
            currentNode = currentNode.next; // 下一个元素
            stringBuilder.append(currentNode.data).append(",");
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
        return stringBuilder.toString();
    }

    public Node getNode(int index){
        // 判断索引合法性
        if (index<0 || index>size-1){
            throw new RuntimeException("索引不合法！"+index);
        }
        Node currentNode;
        // 提高效率，如果索引位置在总长度的前半部分，从前开始向后；如果索引位置在后半部分，从后开始向前
        if (index<(size>>1)){
            currentNode = first;
            for (int i=0;i<index;i++){
                currentNode = currentNode.next;
            }
        }else{
            currentNode = last;
            for (int i=size-1;i>index;i--){
                currentNode = currentNode.previous;
            }
        }
        return currentNode;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.data;
    }
    public void remove(int index){

        if (index==0){
            // 删除的是头节点
            first = first.next;
            first.previous = null;
        }else if(index==size-1){
            // 删除的是尾节点
            last.previous.next = null;
        }else{
            Node node = getNode(index);
            node.next.previous = node.previous;
            node.previous.next = node.next;
        }
        size--;
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

