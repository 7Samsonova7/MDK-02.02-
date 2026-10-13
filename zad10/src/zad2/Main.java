package zad2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProcessing = true;

        System.out.println("Добро пожаловать в ипотечный калькулятор!");

        while (continueProcessing) {
            System.out.println("\nЗаполните данные для ипотечной заявки и узнайте статус одобрения");

            System.out.println("Введите ФИО:");
            String name = scanner.nextLine();

            byte age = 0;
            while (true) {
                System.out.println("Ваш возраст:");
                try {
                    age = scanner.nextByte();
                    break;
                } catch (Exception e) {
                    System.out.println("Ошибка: введите корректный возраст (число).");
                    scanner.next();
                }
            }

            int mortgageAmount = 0;
            while (true) {
                System.out.println("Планируемая сумма ипотеки:");
                try {
                    mortgageAmount = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Ошибка: введите корректную сумму (число).");
                    scanner.next();
                }
            }

            scanner.nextLine();
            String employedString;
            boolean employed = false;
            while (true) {
                System.out.println("Трудоустроены ли вы сейчас? (д/н)");
                employedString = scanner.nextLine();
                if (employedString.equalsIgnoreCase("д") || employedString.equalsIgnoreCase("н")) {
                    employed = employedString.equalsIgnoreCase("д");
                    break;
                } else {
                    System.out.println("Пожалуйста, введите 'д' для да или 'н' для нет.");
                }
            }

            MortgageRequest mortgageRequest = new MortgageRequest(name, age, mortgageAmount, employed);
            mortgageRequest.validate();

            System.out.println("\nХотите подать еще одну заявку? (д/н)");
            String continueString = scanner.nextLine();
            if (!continueString.equalsIgnoreCase("д")) {
                continueProcessing = false;
            }
        }

        System.out.println("Спасибо за использование нашего сервиса. До свидания!");
        scanner.close();
    }
}