package task.three;

public class Jellybean extends Sweet {
    private String countryOfProd;

    public Jellybean(String name, double weight, double price, String countryOfProd) {
        super(name, weight, price);
        this.countryOfProd = countryOfProd;
    }

    public String getFruitFlavor() {
        return countryOfProd;
    }
}