package part7.lesson132;

import java.util.*;

/***
 * @title 容器泛型
 * @description 泛型的本质就是“数据类型的参数化”。我们可以
 *              把“泛型”理解为数据类型的一个占位符(形式参数)，即告诉编译器，在调用泛型时必须传入实际类型
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/14 12:43
 **/
public class Test {
    public static void main(String[] args) {
        // 泛型类在集合的使用
        List<String> list = new ArrayList<>();
        Set<Man> manSet = new HashSet<>();
        Map<Integer, Man> manMap = new HashMap<>();
        Iterator<Man> iterator = manSet.iterator();
        System.out.println(manSet);
        System.out.println(iterator);
    }
}

class Man{

}
