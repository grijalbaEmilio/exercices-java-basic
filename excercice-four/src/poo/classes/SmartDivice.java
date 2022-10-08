package poo.classes;

public class SmartDivice {

    private double price;
    private double weight;
    private String brand;
    private int warrantyYears;

    public SmartDivice() {
    }

    public SmartDivice(double price, double weight, String brand, int warrantyYears) {
        this.price = price;
        this.weight = weight;
        this.brand = brand;
        this.warrantyYears = warrantyYears;
    }

    public void on(){};

    @Override
    public String toString() {
        return "precio: " + this.price + "\npeso: " + this.weight + " \nmarca: "
                + this.brand + "\naños de garantía: " + warrantyYears;
    }

}
