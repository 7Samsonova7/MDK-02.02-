package zad3;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Car, Integer> cars = new TreeMap<>();

        // Хеш-таблица заполняется данными
        cars.put(new Car("Audi A6", 3_760_000), 2);
        cars.put(new Car("Honda CR-V ", 2_500_000), 3);
        cars.put(new Car("KIA Cerato", 1_300_000), 8);
        cars.put(new Car("Volkswagen Tiguan", 1_935_000), 5);

        // Проверяем порядок: машины выведутся от дешевых к дорогим
        System.out.println("Автомобили в отсортированном порядке (по цене):");
        for (Car car : cars.keySet()) {
            System.out.println(car);
        }
    }
}

// 2. Класс Car реализует интерфейс Comparable<Car>
class Car implements Comparable<Car> {
    String model;
    Integer priceInRubles;

    public Car(String model, Integer priceInRubles) {
        this.model = model;
        this.priceInRubles = priceInRubles;
    }

    // 3. Логика сравнения: вычитаем цену текущего объекта из цены переданного
    @Override
    public int compareTo(Car o) {
        return this.priceInRubles - o.priceInRubles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }

    @Override
    public String toString() {
        return "Car{model=" + model + ", priceInRubles=" + priceInRubles + "}";
    }
}