import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();


        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;

        while (isWorking) {
            System.out.println("\n=== Цифровое меню зоопарка ===");
            System.out.println("1. Показать список всех животных");
            System.out.println("2. Добавить животное в список");
            System.out.println("3. Удалить животное из списка");
            System.out.println("4. Очистить весь список");
            System.out.println("5. Проверить наличие животного");
            System.out.println("6. Выход");
            System.out.print("Выберите действие: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите номер команды цифрой.");
                scanner.next();
                continue;
            }

            int command = scanner.nextInt();
            scanner.nextLine();
            switch (command) {
                case 1:
                    printAnimals(animals);
                    break;
                case 2:
                    addAnimal(scanner, animals);
                    break;
                case 3:
                    removeAnimal(scanner, animals);
                    break;
                case 4:
                    clearList(animals);
                    break;
                case 5:
                    checkAnimal(scanner, animals);
                    break;
                case 6:
                    isWorking = false;
                    System.out.println("Программа завершена. До встречи!");
                    break;
                default:
                    System.out.println("Такой команды нет. Попробуйте снова.");
            }
        }
        scanner.close();
    }

    private static void printAnimals(List<String> animals) {
        System.out.println("\nТекущий список обитателей зоопарка:");
        if (animals.isEmpty()) {
            System.out.println("(Список пуст)");
        } else {
            for (String animal : animals) {
                System.out.println("- " + animal);
            }
            System.out.println("Всего животных: " + animals.size());
        }
    }

    private static void addAnimal(Scanner scanner, List<String> animals) {
        System.out.print("Введите название животного для добавления: ");
        String name = scanner.nextLine().trim();
        if (!name.isEmpty()) {
            animals.add(name);
            System.out.println("Животное \"" + name + "\" успешно добавлено.");
        } else {
            System.out.println("Имя не может быть пустым.");
        }
    }

    private static void removeAnimal(Scanner scanner, List<String> animals) {
        if (animals.isEmpty()) {
            System.out.println("Список уже пуст. Нечего удалять.");
            return;
        }

        System.out.print("Введите точное имя животного для удаления: ");
        String name = scanner.nextLine().trim();


        if (animals.remove(name)) {
            System.out.println("Животное \"" + name + "\" удалено из списка.");
        } else {
            System.out.println("Животное \"" + name + "\" не найдено в зоопарке.");
        }
    }

    private static void clearList(List<String> animals) {
        if (animals.isEmpty()) {
            System.out.println("Список уже пуст. Действие пропущено.");
        } else {
            animals.clear();
            System.out.println("Все животные были удалены из списка.");
        }
    }

    private static void checkAnimal(Scanner scanner, List<String> animals) {
        System.out.print("Какое животное вы ищете? ");
        String searchName = scanner.nextLine().trim();


        if (animals.contains(searchName)) {
            System.out.println("Да, " + searchName + " живёт в нашем зоопарке.");
        } else {
            System.out.println("Нет, " + searchName + " у нас пока не поселился.");
        }
    }
}