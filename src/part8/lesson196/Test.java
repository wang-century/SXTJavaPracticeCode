package part8.lesson196;

/***
 * @title 线程的创建
 * @description
 * 1. 继承Thread类，重写run方法
 * 2. 实现Runnable接口(推荐，避免了单继承的局限性)
 * 3. 卖现Callable接口
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 14:31
 **/
public class Test {
    public static void main(String[] args) {
        // 1. 继承Thread类
//        MyThread myThread = new MyThread(); // 创建线程对象
//        myThread.start(); // 启动线程 不保证直接运行 由CPU调用
//        for (int i = 0; i < 20; i++) {
//            System.out.println("正在执行主线程");
//        }
        // 2. 实现Runnable接口
        MyTask myTask = new MyTask();   // 创建任务对象
        Thread thread = new Thread(myTask); // 创建线程对象
        thread.start(); // 启动线程
    }
}

/**
 * 1. 继承Thread类
 */
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("正在执行线程1");
        }
    }
}


/**
 * 2. 实现Runnable接口
 */
class MyTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("正在执行线程2");
        }
    }
}