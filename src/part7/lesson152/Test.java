package part7.lesson152;

/***
 * @title 自定义实现HashMap
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/16 10:58
 **/
public class Test {
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        // 放入元素
        myHashMap.put(16, "cc");
        myHashMap.put(32, "dd");
        myHashMap.put(16, "ee");
        myHashMap.put(22, "b");
        myHashMap.put(33, "c");
        myHashMap.put(44, "d");
        System.out.println(myHashMap);
        System.out.println(myHashMap.get(16));
        System.out.println(myHashMap.get(32));
    }
}


class Node<K,V> {
    int hash;
    K key;
    V value;
    Node next;
}

class MyHashMap<K,V> {
    Node[] table;    // 位桶数组
    int size;   // 存放键值对个数

    public MyHashMap() {
        table = new Node[16];   // 长度一般定义为2的整数次幂
    }

    public void put(K key, V value) {
        // 定义节点对象
        Node node = new Node();
        node.hash = getHash(key.hashCode(), table.length);  // 计算节点的hash
        node.key = key;
        node.value = value;
        node.next = null;
        // 放入位桶数组
        Node temp = table[node.hash];   // 取位桶数组内该索引位置的节点
        boolean replaceFlag = false;    // 是否发生覆盖
        // 此处元素为空则直接放入节点
        if (temp == null) {
            table[node.hash] = node;
        }
        // 此处元素不为空，遍历该处链表
        else {
            while (temp.next != null) {
                // 如果key相等则覆盖
                if (key.equals(temp.key)) {
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }
            // 未发生覆盖
            temp.next = node;
        }
        size++;
    }

    public V get(K key) {
        int hash = getHash(key.hashCode(), table.length);
        V value = null;
        if (table[hash]!=null){
            Node temp = table[hash];
            while (temp!=null){
                if (key.equals(temp.key)){
                    value = (V)temp.value;
                    break;
                }
                if (temp.next!=null){
                    temp = temp.next;
                }
            }
        }
        return value;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Node node : table) {
            if (node == null) {
                continue;
            }
            sb.append(node.key + ":" + node.value + ",");
            while (node.next != null) {
                node = node.next;
                sb.append(node.key + ":" + node.value + ",");
            }
        }
        sb.setCharAt(sb.length() - 1, '}');
        return sb.toString();
    }

    public int getHash(int v, int length) {
        return v & (length - 1);    // 进行位运算
    }
}