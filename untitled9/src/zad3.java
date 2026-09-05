import java.util.ArrayList;
import java.util.HashMap;

public class zad3 {
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
        // Проходим по ключам (именам клиентов) таблицы
        for (String name : customersOrders.keySet()) {
            System.out.println("Заказы " + name + ":");
            ArrayList<Double> value = customersOrders.get(name);
            System.out.println(value);
        }
    }

    double getOrdersSum() {
        double sum = 0;
        // Проходим по спискам заказов (значениям таблицы)
        for (ArrayList<Double> orders : customersOrders.values()) {
            for (double orderPrice : orders) {
                sum += orderPrice;
            }
        }
        return sum;
    }

    void printCustomerOrders(String customerName) {
        // Проверяем наличие ключа перед обращением к нему
        if (customersOrders.containsKey(customerName)) {
            System.out.println("Заказы " + customerName + ":");
            System.out.println(customersOrders.get(customerName));
        }
    }

    String getMaxOrderCustomerName() {
        double maxOrder = 0;
        String customerName = "";

        // Проходим по всем записям хеш-таблицы
        for (String name : customersOrders.keySet()) {
            double currentSum = 0;
            // Считаем сумму для текущего клиента
            for (Double price : customersOrders.get(name)) {
                currentSum += price;
            }
            // Если сумма больше текущей максимальной — обновляем данные
            if (currentSum > maxOrder) {
                maxOrder = currentSum;
                customerName = name;
            }
        }

        return customerName;
    }

    void removeUnprofitableOrders() {
        ArrayList<String> namesToRemove = new ArrayList<>(); // создаем список имен

        // Находим имена всех невыгодных клиентов
        for (String name : customersOrders.keySet()) {
            double ordersSum = 0;
            for (Double price : customersOrders.get(name)) {
                ordersSum += price;
            }
            if (ordersSum < 5000) {
                namesToRemove.add(name); // сохраняем имя во временный список
            }
        }

        // Удаляем найденных клиентов из основной таблицы
        for (String name : namesToRemove) {
            customersOrders.remove(name);
            System.out.println("Клиента " + name + " больше нет в таблице.");
        }
    }
}