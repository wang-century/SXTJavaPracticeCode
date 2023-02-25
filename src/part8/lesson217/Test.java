package part8.lesson217;

import java.util.HashMap;
import java.util.List;

/**
 * 座位
 */
class Seat {
    int x, y;
    boolean used;

    public Seat(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


class HappyCinema {
    String name;
    List<Seat> seats;   // 影院座位
    int x, y;

    /**
     * 初始化
     *
     * @param name 影院名称
     * @param x    横向个数
     * @param y    竖向个数
     */
    public HappyCinema(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    /**
     * 买票
     * @param seat 要买的座位
     * @return 是否成功
     */
    public boolean buyTickets(Seat seat) {
        // 无此座位直接返回失败
        int index = seats.indexOf(seat);
        if (index==-1) {
            return false;
        }
        // 位置已被使用返回失败
        Seat buySeat = seats.get(index);
        if (buySeat.used){
            return false;
        }
        synchronized (seats) {
            if (buySeat.used){
                return false;
            }
            buySeat.used = true;
            return true;
        }
    }
}

/**
 * 顾客
 */
class Customer implements Runnable {
    HappyCinema happyCinema;    // 要去的影院
    Seat seat = null;  // 要购票的位置

    public Customer(HappyCinema happyCinema, Seat seat) {
        this.happyCinema = happyCinema;
        this.seat = seat;
    }

    @Override
    public void run() {
        boolean result = happyCinema.buyTickets(seat);
        if (result) {
            System.out.println(Thread.currentThread().getName() + "购票成功");
        } else {
            System.out.println(Thread.currentThread().getName() + "购票失败");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        HappyCinema cinema = new HappyCinema("随缘", 10, 20); // 十排二十列
        new Thread(new Customer(cinema, 12), "张三").start();
        new Thread(new Customer(cinema, 11), "李四").start();
    }
}
