package part8.lesson214;

class Account {
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

class Drawing extends Thread {
    Account account;
    int drawingMoney;   // 取钱数目
    int packetTotal;    // 口袋总数

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }


    @Override
    public void run() {
        if (account.money <= 0) {
            return;
        }
        synchronized (account) {
            if (account.money - drawingMoney < 0) {
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            account.money -= drawingMoney;
            packetTotal += drawingMoney;
            System.out.println(this.getName() + "-->账户余额为:" + account.money);
            System.out.println(this.getName() + "-->口袋余额为:" + packetTotal);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Account account = new Account(100, "礼金");
        Drawing husband = new Drawing(account, 80, "新郎");
        Drawing wife = new Drawing(account, 90, "新娘");
        husband.start();
        wife.start();
    }
}
