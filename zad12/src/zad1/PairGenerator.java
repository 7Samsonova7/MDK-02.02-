package zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PairGenerator {

    private static final Random rnd = new Random();

    /**
     * Разбивает список незнакомцев по парам.
     */
    public List<List<Stranger>> splitByPairs(List<Stranger> strangers) {
        // Создаем копию списка, чтобы не изменять исходный список в main
        List<Stranger> pool = new ArrayList<>(strangers);
        List<List<Stranger>> pairs = new ArrayList<>();

        while (!pool.isEmpty()) {
            List<Stranger> pair = getRandomPair(pool);
            pairs.add(pair);
        }

        return pairs;
    }

    /**
     * Возвращает одну пару и удаляет её из списка strangers
     */
    private List<Stranger> getRandomPair(List<Stranger> strangers) {
        // Генерируем два случайных индекса в пределах списка
        int p1Index = rnd.nextInt(strangers.size());
        int p2Index = rnd.nextInt(strangers.size());
        while (p2Index == p1Index) {
            p2Index = rnd.nextInt(strangers.size());
        }

        // Получаем элементы по сгенерированным индексам
        Stranger strangerOne = strangers.get(p1Index);
        Stranger strangerTwo = strangers.get(p2Index);

        // Создаем неизменяемый список из двух элементов
        List<Stranger> pair = List.of(strangerOne, strangerTwo);

        // Удаляем обоих незнакомцев из рабочего списка.
        // removeAll принимает коллекцию, поэтому мы передаем нашу пару.
        strangers.removeAll(pair);

        return pair;
    }
}