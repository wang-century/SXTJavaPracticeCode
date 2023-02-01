package part8.lesson203;

/***
 * @title 线程状态
 * @description
 *  1. 新生状态
 *  2. 就绪状态
 *  3. 运行状态
 *  4. 阻塞状态
 *  5. 死亡状态
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 15:14
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println(123);
            System.out.println(Thread.currentThread().getState());
        });   // 新生状态
        System.out.println(thread.getState());
        thread.start();                // 就绪状态
        System.out.println(thread.getState());
        Thread.sleep(200);
        System.out.println(thread.getState());
    }
}
