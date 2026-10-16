package zad4;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> actorsList = new ArrayList<>();
        fillActors(actorsList);


        Map<String, Integer> actorsMap = new LinkedHashMap<>();


        for (String actor : actorsList) {

            actorsMap.put(actor, actorsMap.getOrDefault(actor, 0) + 1);
        }


        for (Map.Entry<String, Integer> entry : actorsMap.entrySet()) {
            String actor = entry.getKey();
            int filmsCount = entry.getValue();
            System.out.println(actor + " снялся в " + filmsCount + " фильмах");
        }
    }

    private static void fillActors(List<String> actors) {
        actors.add("Шон Коннери");
        actors.add("Шон Коннери");
        actors.add("Шон Коннери");
        actors.add("Шон Коннери");
        actors.add("Шон Коннери");
        actors.add("Джордж Лэзенби");
        actors.add("Шон Коннери");
        actors.add("Роджер Мур");
        actors.add("Роджер Мур");
        actors.add("Роджер Мур");
        actors.add("Роджер Мур");
        actors.add("Роджер Мур");
        actors.add("Роджер Мур");
        actors.add("Роджер Мур");
        actors.add("Тимоти Далтон");
        actors.add("Тимоти Далтон");
        actors.add("Пирс Броснан");
        actors.add("Пирс Броснан");
        actors.add("Пирс Броснан");
        actors.add("Пирс Броснан");
        actors.add("Дэниел Крейг");
        actors.add("Дэниел Крейг");
        actors.add("Дэниел Крейг");
        actors.add("Дэниел Крейг");
        actors.add("Дэниел Крейг");
    }
}