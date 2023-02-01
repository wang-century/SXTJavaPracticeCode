package part8.lesson207;

/***
 * @title join插队
 * @description join合并线程, 待此线程执行完成后, 再执行其他线程，其他线程阻塞
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 15:34
 **/
public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            for (int i=0;i<100;i++){
                System.out.println("lambda " + i);
            }
        });
        thread1.start();
        for (int i=0;i<100;i++){
            if (i == 20){
                try {
                    thread1.join(); // 插队
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("main " + i);
        }
    }
}
