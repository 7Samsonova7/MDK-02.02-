package zad2;

public class HandMadeArrayList<T> {

    private int size = 0;
    private Object[] elements;

    public HandMadeArrayList() {
        this.elements = new Object[10];
    }

    /**
     * Сначала проверяем, достиг ли размер массива вместимости.
     * Если достиг — увеличиваем вместимость, иначе сразу добавляем элемент
     */
    public void add(T newElement) {
        // Если количество элементов достигло длины массива, расширяем его
        if (size == elements.length) {
            grow();
        }

        // Добавляем элемент в массив по индексу size
        elements[size] = newElement;
        // Увеличиваем размер массива на единицу
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Element with index " + index + " does not exist");
        }
        return (T) this.elements[index];
    }

    /**
     * Заменяем текущий массив элементов elements на новый с вместимостью +50%
     */
    private void grow() {
        // Новый массив с вместимостью на 50% больше
        Object[] newArray = new Object[elements.length + elements.length / 2];

        // Копируем элементы из старого массива в новый
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }

        // Заменяем ссылку на старый массив новым
        this.elements = newArray;
    }

    public static void main(String[] args) {
        final var ar = new HandMadeArrayList<Integer>();

        System.out.println("Добавляем 2000 элементов...");
        for (int i = 0; i < 2000; i++) {
            ar.add(i);
        }

        System.out.println("Итоговый размер списка: " + ar.size);

        // Проверка того, что данные сохранились корректно
        System.out.println("Первый элемент: " + ar.get(0));
        System.out.println("Последний элемент: " + ar.get(1999));
    }
}