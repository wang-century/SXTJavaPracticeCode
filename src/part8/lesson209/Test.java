package part8.lesson209;

/***
 * @title 线程优先级
 * @description 范围从1-10，优先级低只是意味着获得调度的概率低，并不是绝对先调用优先级高后调用优先级低的线程
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 15:34
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        MyPriority mp = new MyPriority();
        Thread t1 = new Thread(mp);
        Thread t2 = new Thread(mp);
        Thread t3 = new Thread(mp);
        Thread t4 = new Thread(mp);
        Thread t5 = new Thread(mp);
        Thread t6 = new Thread(mp);
        // 在启动前设置优先级
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
        t6.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}

class MyPriority implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "==" + Thread.currentThread().getPriority());
        Thread.yield();
    }
}