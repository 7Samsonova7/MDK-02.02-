package zad2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // ключ — название задачи, значение — выполнена эта задача или ещё нет
        Map<String, Boolean> todos = new HashMap<>();

        todos.put("Выучить Java", true);
        todos.put("Найти классную работу", false);

        // Очищаем хеш-таблицу после добавления задач
        todos.clear();

        System.out.println("Todo-список пуст? Ответ: " + todos.isEmpty());
        System.out.println("Хеш-таблица пуста");
    }
}