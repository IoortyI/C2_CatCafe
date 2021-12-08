package CatCafe;

public interface CatCafe {
    //购入猫猫，参数 猫的属性
    void BuyCat(Cat other);
    void Serve(Customer other);
    void Close();
}
