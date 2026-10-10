package zad2;

public abstract class Parallelogram implements Figure {
    protected final double a;
    protected final double b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getArea() {

        throw new UnsupportedOperationException("Метод getArea() должен быть переопределен в наследнике");
    }
}