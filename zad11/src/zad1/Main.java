package zad1;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        int[] testValues = {1, 333, 999, 1000, 2000, 5000};

        System.out.println("Демонстрация работы DiscountCalculator:");
        for (int value : testValues) {
            int result = calculator.sumAfterDiscount(value);
            if (value < 1000) {
                System.out.printf("Сумма: %d руб. -> Скидка: 0%% -> Итого: %d руб.%n", value, result);
            } else {
                System.out.printf("Сумма: %d руб. -> Скидка: 2%% -> Итого: %d руб.%n", value, result);
            }
        }
    }
}
