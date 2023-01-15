package part7.lesson138;

import java.util.Arrays;

/**
 * 自定义实现ArrayList
 */
public class Test {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>(20);
        myArrayList.add("aa");
        for (int i = 0; i < 100; i++) {
            myArrayList.add("element" + i);
        }
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(0));
        myArrayList.set(1, "23");
        System.out.println(myArrayList);
        myArrayList.remove("23");
        System.out.println(myArrayList);
    }
}

class MyArrayList<E> {
    private Object[] elementData;   // 存储数据
    private int size;   // 长度
    private static final int DEFAULT_CAPACITY = 10; // 默认数组大小

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY]; // 初始化数组大小
    }

    public MyArrayList(int capacity) {
        // 判断容量设置
        if (capacity < 0) {
            throw new RuntimeException("容器容量不能为复数");
        } else if (capacity == 0) {
            elementData = new Object[DEFAULT_CAPACITY];
        } else {
            elementData = new Object[capacity]; // 初始化数组大小
        }
    }

    /**
     * 添加元素
     *
     * @param obj 元素
     */
    public void add(E obj) {
        // 判断是否扩容
        if (size == elementData.length) {
            Object[] newElementData = new Object[elementData.length + (elementData.length >> 1)];   // 原长度+原长度的一半
            System.arraycopy(elementData, 0, newElementData, 0, elementData.length);   // 将旧数据拷贝到新数组
            elementData = newElementData;   // 取代旧数组
        }
        elementData[size++] = obj;
    }

    /**
     * 获取指定索引元素
     *
     * @param index 索引
     * @return 元素
     */
    public E get(int index) {
        // 判断索引合法性
        this.checkRange(index);
        return (E) elementData[index];
    }

    /**
     * 在指定索引位置设置元素值
     *
     * @param index   索引
     * @param element 元素
     */
    public void set(int index, E element) {
        // 判断索引合法性
        this.checkRange(index);
        elementData[index] = element;
    }

    /**
     * 移除符合指定元素的第一个元素
     * @param element 元素
     */
    public void remove(E element) {
        // 挨个比较元素，获取第一个相等的，返回
        for (int i = 0; i < size; i++) {
            if (element.equals(this.get(i))) {
                // 移除元素
                remove(i);
            }
        }
    }

    /**
     * 移除指定索引元素
     * @param index 索引
     */
    public void remove(int index) {
        int needMovedCount = elementData.length-index-1;    // 需要移动的个数
        if (needMovedCount>0){
            System.arraycopy(elementData, index + 1, elementData, index, needMovedCount);
        }
        elementData[--size] = null; // 移除后容器大小-1，默认置为空
    }

    /**
     * 判断索引合法性
     *
     * @param index 索引
     */
    public void checkRange(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引不合法！" + index);
        }
    }

    /**
     * 返回元素个数
     * @return 元素个数
     */
    public int size(){
        return size;
    }

    /**
     * 容器是否为空
     * @return true or false
     */
    public boolean isEmpty(){
        return size == 0;
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elementData[i] + ",");
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
        return stringBuilder.toString();
    }
}
