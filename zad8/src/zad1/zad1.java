package zad1;

import java.util.ArrayList;

public class zad1 {

    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));

        System.out.println("В лесу лето!");

        // Создаем объект "летний лес с зайцами"
        Forest summerForest = new Forest(hares);

        // Явно устанавливаем сезон (хотя по умолчанию он летний)
        Forest.setSeason("лето");

        System.out.println("Список зайцев:");
        summerForest.printHares();

        System.out.println("\nВ лесу зима!");
        // Меняем время года на зиму через статический метод
        Forest.setSeason("зима");

        System.out.println("Список зайцев:");
        summerForest.printHares();
    }
}