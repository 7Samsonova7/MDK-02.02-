import java.util.Scanner;

public class zad2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();

        PersonAccount user = new PersonAccount(name);

        processCurrency(scanner, "Хотите открыть счёт в RUB?", user, "moneyRUB");
        processCurrency(scanner, "Хотите открыть счёт в USD?", user, "moneyUSD");
        processCurrency(scanner, "Хотите открыть счёт в EUR?", user, "moneyEUR");

        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");

        if (user.moneyRUB != null) {
            System.out.println("- RUB");
        }
        if (user.moneyUSD != null) {
            System.out.println("- USD");
        }
        if (user.moneyEUR != null) {
            System.out.println("- EUR");
        }

        scanner.close();
    }

    private static void processCurrency(Scanner scanner, String question, PersonAccount user, String currencyField) {
        System.out.println(question);
        System.out.println("1 - Да");
        System.out.println("2 - Нет");

        int command = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                command = scanner.nextInt();
                if (command == 1 || command == 2) break;
            } else {
                scanner.next(); // Очищаем буфер от текста
            }
            System.out.print("Пожалуйста, введите 1 или 2: ");
        }

        switch (currencyField) {
            case "moneyRUB":
                if (command == 1) user.setMoneyRUB(0.0); else user.setMoneyRUB(null);
                break;
            case "moneyUSD":
                if (command == 1) user.setMoneyUSD(0.0); else user.setMoneyUSD(null);
                break;
            case "moneyEUR":
                if (command == 1) user.setMoneyEUR(0.0); else user.setMoneyEUR(null);
                break;
        }
    }
}

class PersonAccount {
    String name;
    Double moneyRUB;
    Double moneyUSD;
    Double moneyEUR;

    PersonAccount(String userName) {
        this.name = userName;
        this.moneyRUB = null;
        this.moneyUSD = null;
        this.moneyEUR = null;
    }

    public void setMoneyRUB(Double value) { this.moneyRUB = value; }
    public void setMoneyUSD(Double value) { this.moneyUSD = value; }
    public void setMoneyEUR(Double value) { this.moneyEUR = value; }
}