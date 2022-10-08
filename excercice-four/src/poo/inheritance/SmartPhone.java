package poo.inheritance;

import poo.classes.SmartDivice;

public class SmartPhone extends SmartDivice {

    public SmartPhone() {
    }

    public SmartPhone(double price, double weight, String brand, int warrantyYears) {
        super(price, weight, brand, warrantyYears);
    }

    @Override
    public void on() {
        System.out.println("encendiendo teléfoneo...");
    }
}
