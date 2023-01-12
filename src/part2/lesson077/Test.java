package part2.lesson077;

/***
 * @title 重写equals方法
 * @description <TODO description class purpose>
 * @author SDBINA
 * @version 1.0.0
 * @create 2023/1/12 13:51
 **/
public class Test {
    public static void main(String[] args) {
        User user1 = new User(1001, "张三");
        User user2 = new User(1001, "张三");

        System.out.println(user1 == user2); // false
        System.out.println(user1.equals(user2));    // true
    }
}


class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && name.equals(user.name);
    }
}