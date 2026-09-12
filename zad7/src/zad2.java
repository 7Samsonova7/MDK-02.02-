public class zad2 {

    public static void main(String[] args) {
        // Создаем экземпляры песен
        Song theRockBandSong = new Song("Popular Song", "The Rock Band", "John Doe");
        Song johnDoeSong = new Song("Popular Song", "The Rock Band", "John Doe");

        Song rapSong = new Song("A song about a hard life", "Popular Rapper", "Popular Rapper");
        Song richardRoeSong = new Song("A song about a hard life", "Popular Rapper", "Richard Roe");

        System.out.println("Проверка контрактов equals():");

        // 0. Рефлексивность: объект равен самому себе
        boolean check0 = johnDoeSong.equals(johnDoeSong);
        System.out.println("Рефлексивность (a.equals(a)): " + check0);

        // 1. Симметричность: если A равно B, то B равно A
        boolean check1 = theRockBandSong.equals(johnDoeSong) && johnDoeSong.equals(theRockBandSong);
        System.out.println("Симметричность (a.equals(b) <-> b.equals(a)): " + check1);

        // 2. Неравенство объекту другого класса (и защита от ClassCastException через проверку getClass())
        boolean check2 = !rapSong.equals(42);
        System.out.println("Неравенство другому типу (!a.equals(non-Song)): " + check2);

        // 3. Неравенство пустой ссылке
        boolean check3 = !theRockBandSong.equals(null);
        System.out.println("Неравенство null (!a.equals(null)): " + check3);

        // 4. Корректное сравнение объектов одного класса по значению полей
        boolean check4 = !richardRoeSong.equals(johnDoeSong);
        System.out.println("Корректное неравенство разных объектов: " + check4);

        // 5. Транзитивность: если A=B и B=C, то A=C
        Song popularSong = new Song("Popular Song", "The Rock Band", "John Doe");
        boolean check5 = popularSong.equals(theRockBandSong) &&
                theRockBandSong.equals(johnDoeSong) &&
                popularSong.equals(johnDoeSong);
        System.out.println("Транзитивность (a=b, b=c -> a=c): " + check5);

        // 6. Согласованность: повторные вызовы возвращают тот же результат
        boolean check6 = true;
        boolean resultFirst = rapSong.equals(richardRoeSong);
        for (int i = 0; i < 10; i++) {
            if (rapSong.equals(richardRoeSong) != resultFirst) {
                check6 = false;
                break;
            }
        }
        System.out.println("Согласованность (многократный вызов дает один результат): " + check6);

        // Дополнительная проверка контракта между equals() и hashCode()
        // Если объекты равны, их хеш-коды должны быть одинаковыми
        boolean hashContract = !(johnDoeSong.equals(theRockBandSong)) ||
                (johnDoeSong.hashCode() == theRockBandSong.hashCode());
        System.out.println("Контракт hashCode (equals -> одинаковые hashCode): " + hashContract);

        // Итоговый вердикт
        boolean allPassed = check0 && check1 && check2 && check3 && check4 && check5 && check6 && hashContract;
        System.out.println("\nВсе тесты пройдены успешно: " + allPassed);
    }
}