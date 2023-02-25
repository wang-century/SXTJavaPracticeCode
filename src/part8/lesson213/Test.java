package part8.lesson213;

import java.util.ArrayList;
import java.util.List;

/**
 * 为保证数据在方法中被访问时的正确性，在访问时加入锁机制。当一个线程获得对象的排它锁，独占资源，其他线程必须等待，使用后释放锁即可。
 * 同步方法：
 * public synchronized void function()
 *
 * 同步块：
 * synchronized(对象){
 * 对该对象的操作...
 * }
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                synchronized (list) {
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(list.size());

    }

    public synchronized void add(int a){

    }
}
