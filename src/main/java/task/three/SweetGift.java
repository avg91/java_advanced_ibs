package task.three;

import java.util.ArrayList;
import java.util.List;

class Sweet {
    private String name;
    private double weight; // вес в граммах
    private double price;
    private String uniqueParameter;

    public Sweet(String name, double weight, double price, String uniqueParameter) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniqueParameter = uniqueParameter;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getUniqueParameter() {
        return uniqueParameter;
    }
}

public class SweetGift {
    public static void main(String[] args) {
        List<Sweet> gift = new ArrayList<>();

        // добавляем сладости в подарок
        gift.add(new Sweet("Candy", 50, 1.5, "Chocolate flavor"));
        gift.add(new Sweet("Jellybean", 30, 2.0, "Fruit flavor"));
        gift.add(new Sweet("Lollipop", 20, 1.0, "Cherry flavor"));

        // находим общий вес и общую стоимость подарка
        double totalWeight = 0;
        double totalPrice = 0;

        for (Sweet sweet : gift) {
            totalWeight += sweet.getWeight();
            totalPrice += sweet.getPrice();
        }

        // выводим информацию о сладостях в подарке
        System.out.println("Сладкий подарок содержит следующие сладости:");
        for (Sweet sweet : gift) {
            System.out.println("Название: " + sweet.getName());
            System.out.println("Вес: " + sweet.getWeight() + " грамм");
            System.out.println("Стоимость: $" + sweet.getPrice());
            System.out.println("Уникальный параметр: " + sweet.getUniqueParameter());
            System.out.println();
        }

        // выводим общий вес и стоимость подарка
        System.out.println("Общий вес подарка: " + totalWeight + " грамм");
        System.out.println("Общая стоимость подарка: $" + totalPrice);
    }
}