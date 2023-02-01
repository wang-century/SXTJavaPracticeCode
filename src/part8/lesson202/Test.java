package part8.lesson202;

/***
 * @title lambda简化线程
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 15:05
 **/
public class Test {
    /**
     * 静态内部类
     */
    static class TestThread implements Runnable{
        @Override
        public void run() {
            System.out.println("test");
        }
    }

    public static void main(String[] args) {
        // 1.静态内部类
        new Thread(new TestThread()).start();
        // 2.局部内部类
        class TestThread2 implements Runnable{
            @Override
            public void run() {
                System.out.println("test2");
            }
        }
        new Thread(new TestThread2()).start();
        // 3.匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("test3");
            }
        }).start();
        // 4.lambda表达式
        new Thread(()->{
            System.out.println("test4");
        }).start();
    }
}
