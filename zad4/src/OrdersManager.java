import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrdersManager {
    HashMap<String, ArrayList<Double>> customersOrders;

    public OrdersManager() {
        customersOrders = new HashMap<>();
        ArrayList<Double> orders = new ArrayList<>();
        orders.add(154.43);
        orders.add(5453.98);
        orders.add(8776.65);
        customersOrders.put("Иван И.", orders);

        orders = new ArrayList<>();
        orders.add(25343.54);
        orders.add(420.50);
        customersOrders.put("Ольга С.", orders);

        orders = new ArrayList<>();
        orders.add(325.90);
        customersOrders.put("Александр Т.", orders);

        orders = new ArrayList<>();
        orders.add(253.54);
        orders.add(420.50);
        customersOrders.put("Александр Р.", orders);

        orders = new ArrayList<>();
        orders.add(780.54);
        orders.add(420.50);
        orders.add(36343.54);
        orders.add(2000.50);
        customersOrders.put("Екатерина О.", orders);
    }

    void printAllOrders() {
        // Цикл по ключам (именам клиентов)
        for (String name : customersOrders.keySet()) {
            System.out.println("Заказы " + name + ":");
            ArrayList<Double> value = customersOrders.get(name);
            System.out.println(value);
        }
    }

    double getOrdersSum() {
        double sum = 0;
        // Цикл по значениям (спискам заказов)
        for (ArrayList<Double> orders : customersOrders.values()) {
            for (double orderPrice : orders) {
                sum += orderPrice;
            }
        }
        return sum;
    }

    void printCustomerOrders(String customerName) {
        // Проверка наличия ключа в таблице
        if (customersOrders.containsKey(customerName)) {
            System.out.println("Заказы " + customerName + ":");
            System.out.println(customersOrders.get(customerName));
        }
        // Если клиент не найден – ничего не выводим (можно добавить сообщение при желании)
    }

    String getMaxOrderCustomerName() {
        double maxOrder = 0;
        String customerName = "";

        // Проходим по всем записям таблицы
        for (Map.Entry<String, ArrayList<Double>> entry : customersOrders.entrySet()) {
            String name = entry.getKey();
            ArrayList<Double> orders = entry.getValue();
            double sum = 0;
            for (double price : orders) {
                sum += price;
            }
            if (sum > maxOrder) {
                maxOrder = sum;
                customerName = name;
            }
        }

        return customerName;
    }

    void removeUnprofitableOrders() {
        // Список клиентов с суммой заказов меньше 5000
        ArrayList<String> names = new ArrayList<>();

        // Наполняем список
        for (String name : customersOrders.keySet()) {
            double ordersSum = 0;
            for (double price : customersOrders.get(name)) {
                ordersSum += price;
            }
            if (ordersSum < 5000) {
                names.add(name);
            }
        }

        // Удаляем таких клиентов из хеш-таблицы
        for (String name : names) {
            customersOrders.remove(name);
            System.out.println("Клиента " + name + " больше нет в таблице.");
        }
    }
}
