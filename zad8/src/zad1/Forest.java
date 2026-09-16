package zad1;

import zad1.MountainHare;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;

    // Статическая переменная сезона. Одинакова для всех лесов.
    private static String season = "лето";

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    // Статический метод смены сезона. Меняет глобальное время года.
    public static void setSeason(String newSeason) {
        if (!newSeason.equals(season)) {
            season = newSeason;

            // Логика смены цвета шубок
            if ("зима".equalsIgnoreCase(newSeason)) {
                MountainHare.color = "белый";
            } else {
                MountainHare.color = "серо-рыжий";
            }
        }
    }

    // Метод печати списка зайцев текущего леса
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}