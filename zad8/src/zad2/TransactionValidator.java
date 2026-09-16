package zad2;
public class TransactionValidator {
    public static final double MIN_AMOUNT = 1.0;
    public static final double MAX_AMOUNT = 5000.0;

    /**
     * Проверяет, находится ли сумма перевода в допустимом диапазоне.
     * @param amount Сумма перевода
     * @return true, если сумма корректна; false в противном случае.
     */
    public static boolean isValidAmount(double amount) {
        if (amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }

        if (amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }

        return true;
    }
}