package Zad4;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Main pizzeria = new Main();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        // Получаем текущее количество заказов (если клиента нет в таблице, вернется 0)
        // и увеличиваем его на 1
        int currentCount = orders.getOrDefault(clientName, 0);
        orders.put(clientName, currentCount + 1);
    }

    private void printStatistics() {
        int totalOrders = 0;

        // Итерация по всем записям в хеш-таблице
        for (Map.Entry<String, Integer> entry : orders.entrySet()) {
            System.out.println("Заказов от " + entry.getKey() + ": " + entry.getValue());
            totalOrders += entry.getValue();
        }

        System.out.println("Всего заказов: " + totalOrders);
    }
}