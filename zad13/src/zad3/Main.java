package zad3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    // Пример списка пассажиров (на самом деле их больше)
    private static List<String> passengerNames = List.of(
            "Василий Петров",
            "Анна Ягирская",
            "Виктория Сотова",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        // Создаем хеш-таблицу для хранения соответствия пассажира и его места
        Map<String, Integer> seats = new HashMap<>();

        // Счётчик мест, первое место — 1
        int seat = 1;

        // Проходим по списку всех пассажиров
        for (String passenger : passengerNames) {
            // Назначаем текущее значение счётчика пассажиру
            seats.put(passenger, seat);

            // Увеличиваем счётчик для следующего пассажира
            seat += 1;
        }

        return seats;
    }
}