package CatCafe;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Cat> catlist = new ArrayList<Cat>();
        MyCatCafe mcc = new MyCatCafe(500, catlist);

        catlist.add(new BlackCat("Joe", 2, 1));
        catlist.add(new OrangeCat("Jim", 1, 0));
        catlist.add(new BlackCat("Preach", 5, 1));

        System.out.println("店内余额为："+mcc.getBalance());

        try {
            mcc.BuyCat(new BlackCat("Paff", 5, 1));
            mcc.BuyCat(new OrangeCat("bobo", 3, 0));
            mcc.BuyCat(new BlackCat("Neko", 3, 0));
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }

        System.out.println("店内余额为："+mcc.getBalance());

        mcc.Serve(new Customer("ryh", 3, 2021, 3, 1));
        mcc.Close();
        System.out.println("店内余额为："+mcc.getBalance());

        mcc.Serve(new Customer("px", 2, 2021, 3, 11));
        mcc.Serve(new Customer("sda", 1, 2021, 3, 11));
        mcc.Serve(new Customer("pfa", 4, 2021, 3, 11));
        mcc.Close();
        System.out.println("店内余额为："+mcc.getBalance());

        mcc.Close();

    }
}
