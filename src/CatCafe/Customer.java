package CatCafe;

import java.time.LocalDate;

public class Customer {
    private String name;
    private int rua;
    private LocalDate arrive;

    Customer(String name,int rua,int year,int month,int day){
        this.name = name;
        this.rua = rua;
        arrive = LocalDate.of(year,month,day);
    }

    Customer(Customer c){
        this.name=c.getName();
        this.rua=c.getRua();
        this.arrive=c.getTime();
    }
    public String toString(){
        String s;
        s = name+" rua the cat "+rua+" times on " +arrive.getYear()
                +"-"+ arrive.getMonthValue()+"-"+ arrive.getDayOfMonth();
        return s;
    }

    public int getRua(){
        return rua;
    }

    public String getName(){
        return name;
    }

    public LocalDate getTime(){
        return arrive;
    }
}
