package task.three;

public class Candy extends Sweet {
    private String brand;

    public Candy(String name, double weight, double price, String brand) {
        super(name, weight, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}