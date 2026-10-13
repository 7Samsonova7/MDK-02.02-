package zad2;

public class MortgageAmountValidationRule extends ValidationRule<Integer> {

    private static final int MIN_AMOUNT = 1_000_000;
    private static final int MAX_AMOUNT = 10_000_000;

    public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    @Override
    public boolean isValid() {
        return value >= MIN_AMOUNT && value <= MAX_AMOUNT;
    }
}