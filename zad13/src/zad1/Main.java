package zad1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> citiesPopulation = new HashMap<>();
        citiesPopulation.put("Москва", 12_655_050);
        citiesPopulation.put("Лондон", 8_961_989);
        citiesPopulation.put("Нью-Йорк", 8_804_190);

        String city = "Париж";

        int cityPopulation = citiesPopulation.getOrDefault(city, 0);

        if (cityPopulation > 0) {
            System.out.println("Через 1 год население города " + city + " будет: " + (int)(cityPopulation * 1.01));
        } else {
            System.out.println("Нет данных о населении города " + city);
        }
    }
}