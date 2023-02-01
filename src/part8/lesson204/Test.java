package part8.lesson204;

/***
 * @title 线程的终止
 * @description
 *  1. 线程正常执行完毕
 *  2. 外部干涉 （加入标识）
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 15:23
 **/
public class Test implements Runnable {
    private boolean keepRun = true; // 标识

    public static void main(String[] args) {
        Test test = new Test();
        new Thread(test).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        test.stop();
    }

    @Override
    public void run() {
        // 关联标识
        while (keepRun) {
            System.out.println("running...");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 改变标识
     */
    public void stop() {
        this.keepRun = false;
    }
}


