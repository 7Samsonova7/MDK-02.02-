package zad2;

public class Rhombus extends Parallelogram {

    private final double h;

    public Rhombus(double a, double h) {

        super(a, a);
        this.h = h;
    }

    @Override
    public double getArea() {

        return a * h;
    }
}