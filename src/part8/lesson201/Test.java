package part8.lesson201;

/***
 * @title 静态代理模式
 * @description
 *  接口
 *   1.真实劫色
 *   2.代理角色
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/31 15:01
 **/
public class Test {
    public static void main(String[] args) {
        new WeddingCompany(new Wife()).happyMarry();
    }
}

interface Marry{
    void happyMarry();
}

class Wife implements Marry{

    @Override
    public void happyMarry() {
        System.out.println("happy marry");
    }
}

/**
 * 代理角色
 */
class WeddingCompany implements Marry{

        private Marry target;   // 真实角色

        public WeddingCompany(Marry target) {
            this.target = target;
        }

        @Override
        public void happyMarry() {
            before();
            this.target.happyMarry();
            after();
        }

        private void before(){
            System.out.println("before");
        }

        private void after(){
            System.out.println("after");
        }
}