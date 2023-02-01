package part8.lesson200;

import java.util.concurrent.*;

/***
 * @title 了解Callable(可返回结果 、 抛出异常)
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 14:54
 **/
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // 提交执行
        Future<Integer> result1 = executorService.submit(new Task());
        Future<Integer> result2 = executorService.submit(new Task());
        Future<Integer> result3 = executorService.submit(new Task());
        // 获取结果
        Integer integer1 = result1.get();
        Integer integer2 = result2.get();
        Integer integer3 = result3.get();
        System.out.println(integer1 + "-->" + integer2 + "-->" + integer3);
        // 关闭服务
        executorService.shutdown();
    }
}


class Task implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return 1;
    }
}