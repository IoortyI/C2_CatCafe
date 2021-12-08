package CatCafe;

public class OrangeCat extends Cat {
    private boolean isFat;

    OrangeCat(String name, int age, int sex) {
        super(name, age, sex, 200);
    }

    public String toString() {
        String sexs;
        if (sex == 0) {
            sexs = "female";
        } else {
            sexs = "male";
        }
        return name + " is a " + age + "-year-old " + sexs + " orange cat, worth " + price;
    }
}
