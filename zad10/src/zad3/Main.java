package zad3;

import java.util.Scanner;

public class Main {

    private static ContactBook<Phone> friendsContactBook = new ContactBook<>();
    private static ContactBook<Email> colleaguesContactBook = new ContactBook<>();
    private static ContactBook<SocialNetworkContact> classmatesContactBook = new ContactBook<>();
    private static ContactBook<Address> relativesContactBook = new ContactBook<>();

    public static void main(String[] args) {
        fillBooks();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Сегодня Новый Год! 1 - Отправить поздравление, 0 - Напомнить позднее");
            int mainCommand = scanner.nextInt();
            if (mainCommand == 1) {
                System.out.println("Какую книгу контактов открыть?");
                System.out.println("1 - Друзья, 2 - Коллеги, 3 - Одногруппники, 4 - Родственники");

                int bookIndex = scanner.nextInt();
                switch (bookIndex) {
                    case 1 -> friendsContactBook.printList();
                    case 2 -> colleaguesContactBook.printList();
                    case 3 -> classmatesContactBook.printList();
                    case 4 -> relativesContactBook.printList();
                    default -> System.out.println("Неверный выбор книги.");
                }

                System.out.println("Кого вы хотите поздравить? Введите имя:");
                String name = scanner.next();
                switch (bookIndex) {
                    case 1 -> friendsContactBook.congratulate(name);
                    case 2 -> colleaguesContactBook.congratulate(name);
                    case 3 -> classmatesContactBook.congratulate(name);
                    case 4 -> relativesContactBook.congratulate(name);
                }
            } else if (mainCommand == 0) {
                break;
            }
        }
        scanner.close();
    }

    private static void fillBooks() {
        friendsContactBook.addContact(new Phone("Иван", "+7-909-000-11-22"));
        friendsContactBook.addContact(new Phone("Маша", "+7-999-555-11-22"));
        friendsContactBook.addContact(new Phone("Кирилл", "+7-979-698-00-22"));

        colleaguesContactBook.addContact(new Email("Александр", "sasha@sasha.ru"));
        colleaguesContactBook.addContact(new Email("Павел", "pasha@pasha.ru"));
        colleaguesContactBook.addContact(new Email("Олег", "oleg@oleg.ru"));

        classmatesContactBook.addContact(new SocialNetworkContact("Оля", "НаСвязи", "olya"));
        classmatesContactBook.addContact(new SocialNetworkContact("Женя", "Фотопризма", "zhenya"));

        relativesContactBook.addContact(new Address("Бабуля", "Москва", "Тверская, д.8"));
        relativesContactBook.addContact(new Address("Дедуля", "Воронеж", "Ленина, д.10"));
    }
}