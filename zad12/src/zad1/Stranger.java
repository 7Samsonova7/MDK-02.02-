package zad1;

public class Stranger {
    public final String name;
    public final int age;

    public Stranger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stranger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}