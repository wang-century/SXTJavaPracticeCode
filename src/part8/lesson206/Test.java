package part8.lesson206;

/***
 * @title yield从运行状态转入就绪状态，等待CPU重新调度
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 15:32
 **/
public class Test {
    public static void main(String[] args) {
        new Thread(new TestYield(), "A").start();
        new Thread(new TestYield(), "B").start();
    }
}


class TestYield implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i % 10 == 0) {
                Thread.yield(); // 从运行状态转入就绪状态，等待CPU重新调度
            }
        }
    }
}