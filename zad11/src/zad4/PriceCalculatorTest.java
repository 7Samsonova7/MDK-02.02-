package zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    // Тесты для велосипеда (BIKE)

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs0Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, 0);
        Assertions.assertEquals(-1, price);
    }

    @Test
    public void shouldReturn100ForBikeAndDistanceIs10Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, 10);
        Assertions.assertEquals(100, price);
    }

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs21Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, 21);
        Assertions.assertEquals(-2, price);
    }

    // Тесты для легкового автомобиля (CAR)

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs0Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, 0);
        Assertions.assertEquals(-1, price);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs1001Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, 1001);
        Assertions.assertEquals(-2, price);
    }

    @Test
    public void shouldReturn7000ForCarAndDistanceIs1000Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, 1000);
        Assertions.assertEquals(7000, price);
    }

    // Тесты для фуры (TRUCK)

    @Test
    public void shouldBeNegativeWhenTruckAndDistanceIs0Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.TRUCK, 0);
        Assertions.assertEquals(-1, price);
    }

    @Test
    public void shouldReturn5000ForTruckAndDistanceIs1000Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.TRUCK, 1000);
        Assertions.assertEquals(5000, price);
    }

    // Тест для квадрокоптера (DRONE)

    @Test
    public void shouldBeNullWhenDroneAndDistanceIs0Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.DRONE, 0);
        Assertions.assertNull(price);
    }
}