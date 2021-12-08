package CatCafe;

public class BlackCat extends Cat {
    BlackCat(String name, int age, int sex) {
        super(name, age, sex, 350);
    }

    public String toString() {
        String sexs;
        if (sex == 0) {
            sexs = "female";
        } else {
            sexs = "male";
        }
        return name + " is a " + age + "-year-old " + sexs + " black cat, worth " + price;
    }
}
