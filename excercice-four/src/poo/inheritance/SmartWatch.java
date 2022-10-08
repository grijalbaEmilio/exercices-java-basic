package poo.inheritance;

import poo.classes.SmartDivice; 

public class SmartWatch extends SmartDivice{

    public SmartWatch() {
    }

    public SmartWatch(double price, double weight, String brand, int warrantyYears) {
        super(price, weight, brand, warrantyYears);
    }

    @Override
    public void on() {
        System.out.println("encendiendo reloj...");
    }
    
}
