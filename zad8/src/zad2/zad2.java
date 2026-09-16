package zad2;
import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;

        while (true) {
            System.out.println("Пожалуйста, введите сумму перевода в рублях.");

            // Проверка на случай ввода текста вместо числа
            if (!scanner.hasNextDouble()) {
                System.out.println("Ошибка: введено нечисловое значение. Попробуйте ещё раз!");
                scanner.next(); // очищаем неверный ввод из буфера
                continue;
            }

            amount = scanner.nextDouble();

            boolean isValid = TransactionValidator.isValidAmount(amount);

            if (isValid) {
                break; // выходим из цикла, если проверка пройдена
            }
        }

        System.out.println("Спасибо! Ваш перевод на сумму " + amount + " р. успешно выполнен.");
        scanner.close();
    }
}