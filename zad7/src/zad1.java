
public class zad1 {
    static LostAndFoundOffice lostAndFound = new LostAndFoundOffice();

    public static void main(String[] args) {

        Ball ball = new Ball();
        Accordion accordion = new Accordion();
        Umbrella umbrella = new Umbrella();
        Hat hat = new Hat(); // Эту шляпу мы НЕ будем сдавать в бюро

        lostAndFound.put(ball);
        lostAndFound.put(accordion);
        lostAndFound.put(umbrella);

        checkObject(accordion, "Аккордеон");
        checkObject(ball, "Мяч");
        checkObject(null, "Пустая ссылка");
        checkObject(umbrella, "Зонт");
        checkObject(hat, "Шляпа");
    }

    private static void checkObject(Object object, String description) {
        if(lostAndFound.check(object)) {
            System.out.println("'" + description + "' нашёлся!");
        } else {
            System.out.println("'" + description + "' в бюро находок никто не приносил :(");
        }
    }
}
