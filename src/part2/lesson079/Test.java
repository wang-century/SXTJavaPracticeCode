package part2.lesson079;

/***
 * @title 封装的使用：访问控制符
 * @description 1.提高代码的安全性。
 *              2.提高代码的复用性。
 *              3.“高内聚”︰封装细节，便于修改内部代码，提高可维护性。
 *              4.“低耦合”︰简化外部调用，便于调用者使用，便于扩展和协作。
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/12 14:11
 **/
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(-1);  // 非法年龄
    }
}

class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=0&&age<130){
            this.age = age;
        }else{
            System.out.println("非法年龄");
        }
    }
}

