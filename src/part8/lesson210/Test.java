package part8.lesson210;

/**
 * 守护线程
 * 守护线程为用户线程服务，JVM停止不用等待守护线程执行完毕
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        God god = new God();
        god.setDaemon(true);    // 将线程设为守护线程
        god.start();
        person.start();
    }
}

class Person extends Thread{
    @Override
    public void run() {
        for (int i=0;i<365*100;i++){
            System.out.println("生活...");
        }
    }
}

class God extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("保佑你...");
        }
    }
}