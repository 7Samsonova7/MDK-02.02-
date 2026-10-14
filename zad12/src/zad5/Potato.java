package zad5;

import java.util.Objects;

public class Potato implements Comparable<Potato> {

    public final int id;
    public final int weight;
    public final int length;
    public final int girth;

    public Potato(int id, int weight, int length, int girth) {
        this.id = id;
        this.weight = weight;
        this.length = length;
        this.girth = girth;
    }

    /**
     * Вспомогательный метод для вычисления альфа-характеристики.
     */
    public int calculateAlpha() {
        return (int) (weight * 0.5 + length * 0.65 + girth * 0.80);
    }

    @Override
    public int compareTo(Potato o) {
        if (o == null) {
            return 1;
        }
        if (this == o) {
            return 0;
        }
        return Integer.compare(this.calculateAlpha(), o.calculateAlpha());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Potato potato = (Potato) o;
        return id == potato.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Potato{" +
                "id=" + id +
                ", weight=" + weight +
                ", length=" + length +
                ", girth=" + girth +
                '}';
    }
}