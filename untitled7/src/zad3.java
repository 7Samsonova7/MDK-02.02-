public class zad3 {
    public static void main(String[] args) {
        String pixelKcalDay = "43";
        String chickenKcal = "23.8";
        String beefKcal = "30.2";
        String creamKcal = "32.1";
        String milkKcal = "13.5";

        Float pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);


        float totalKcal = Integer.parseInt(pixelKcalDay) + pixelChoice;

        checkKcal(totalKcal);
    }

    private static Float getMinKcalsSum(String firstDishKcal, String secondDishKcal,
                                        String firstDessert, String secondDessert) {

        float dish1 = Float.parseFloat(firstDishKcal);
        float dish2 = Float.parseFloat(secondDishKcal);
        float dessert1 = Float.parseFloat(firstDessert);
        float dessert2 = Float.parseFloat(secondDessert);


        float minDishKcal = Float.min(dish1, dish2);
        float minDessertKcal = Float.min(dessert1, dessert2);

        return minDishKcal + minDessertKcal;
    }

    private static void checkKcal(Float catKcal) {
        if (catKcal == null) {
            System.out.println("Что-то пошло не так");
        } else {
            System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
            if (catKcal > 100) {
                System.out.println("Пиксель сегодня не уложился в норму.");
            } else {
                System.out.println("Лимит не превышен!");
            }
        }
    }
}