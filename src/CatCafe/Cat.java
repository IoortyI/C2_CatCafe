package CatCafe;

public abstract class Cat {
   protected String name;
   protected int age;
   protected int sex;
   protected double price;

   public Cat(String name,int age,int sex,double price){
       this.name = name;
       this.age = age;
       this.sex = sex;
       this.price = price;
   }

   public abstract String toString();
}
