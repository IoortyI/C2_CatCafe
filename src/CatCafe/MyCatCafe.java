package CatCafe;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ListIterator;


public class MyCatCafe implements CatCafe {
    private double balance;//余额
    private LocalDate lastDay;//记录上次开店时间
    private ArrayList<Cat> miaoList = new ArrayList<>();//店里现有猫猫
    private ArrayList<Customer> guestList = new ArrayList<>();//来访顾客记录（允许同一个人重复）

    public MyCatCafe(double b, ArrayList<Cat> m) {
        balance = b;
        miaoList = m;
    }

    public double getBalance() {
        return balance;
    }

    public void BuyCat(Cat neo) throws InsufficientBalanceException {
        if (balance < neo.price) {
            String s = "buy " + neo.name + " need " + neo.price + " ,but only " + balance;
            throw new InsufficientBalanceException(s);
        }
        balance -= neo.price;
        miaoList.add(neo);
    }

    public void Serve(Customer neo) throws CatNotFoundException {
        int seed;
        //没猫摸就回家吧
        if (miaoList.isEmpty()) {
            String s = "Customer " + neo.getName() + " had no cat to rua.";
            throw new CatNotFoundException(s);
        }
        guestList.add(neo);
        lastDay = neo.getTime();
        //已知rua次数，直接计算收益
        balance += neo.getRua() * 15;
        //用random随机打印猫猫信息
        System.out.println(neo.getName() + " rua过的猫猫有：");
        for (int i = neo.getRua(); i > 0; i--) {
            seed = (int) (Math.random() * miaoList.size());
            System.out.println(miaoList.get(seed));
        }
    }

    public void Close() {
        int profit = 0;
        Customer temp;
        if (guestList.isEmpty()) {
            System.out.println("还没有顾客关顾过哦，这™也太惨了");
            return;
        }
        //没有反向迭代器，只好遍历两遍
        ListIterator<Customer> li = guestList.listIterator();
        //将li指向表尾
        while (li.hasNext()) {
            li.next();
        }
        while (li.hasPrevious()) {
            temp = li.previous();
            if (temp.getTime().equals(lastDay)) {
                System.out.println(temp);
                profit += temp.getRua();
            }
            else{
                break;
            }
        }
            lastDay = li.next().getTime();
            profit *= 15;
            System.out.println("当天利润为：" + profit);
    }
}
