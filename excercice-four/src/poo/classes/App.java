package poo.classes;

import poo.inheritance.SmartPhone;
import poo.inheritance.SmartWatch;

public class App {
    public static void main(String[] args) throws Exception {

        SmartDivice equipmentOne = new SmartPhone(10000, 40, "casio", 2);
        SmartDivice equipmentTwo = new SmartWatch(50000, 70, "xiaomi", 2);

        System.out.println("telefono: " + equipmentOne);
        System.out.println("reloj: " + equipmentTwo);

        equipmentOne.on();
        equipmentTwo.on();
    }
}
