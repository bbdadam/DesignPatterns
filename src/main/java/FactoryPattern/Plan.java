package FactoryPattern;

public abstract class Plan {
    public double rate;
    abstract public void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
