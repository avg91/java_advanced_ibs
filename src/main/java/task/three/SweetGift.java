package task.three;

import java.util.ArrayList;
import java.util.List;

public class SweetGift {
    public static void main(String[] args) {
        List<Sweet> gift = new ArrayList<>();

        // добавляем сладости в подарок
        gift.add(new Candy("Candy", 50, 1.5, "Red october"));
        gift.add(new Jellybean("Jellybean", 30, 2.0, "USA"));
        gift.add(new Lollipop("Lollipop", 20, 1.0, "Cherry"));

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

            if (sweet instanceof Candy) {
                System.out.println("Бренд: " + ((Candy) sweet).getBrand());
            } else if (sweet instanceof Jellybean) {
                System.out.println("Страна производства: " + ((Jellybean) sweet).getFruitFlavor());
            } else if (sweet instanceof Lollipop) {
                System.out.println("Вкус: " + ((Lollipop) sweet).getCherryFlavor());
            }

            System.out.println();
        }

        // выводим общий вес и стоимость подарка
        System.out.println("Общий вес подарка: " + totalWeight + " грамм");
        System.out.println("Общая стоимость подарка: $" + totalPrice);
    }
}