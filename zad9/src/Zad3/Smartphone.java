package Zad3;

public class Smartphone extends MobilePhone {

    public Smartphone(String number) {
        super(number);
    }

    // Перегрузка метода makeCall для звонка через стороннее приложение
    public void makeCall(String targetNumber, String appName) {
        System.out.println("Звоним с номера " + getNumber());
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
        System.out.println("Привет!");
    }

    // Новый метод для отправки email
    public void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}