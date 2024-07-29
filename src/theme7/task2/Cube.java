package theme7.task2;

public class Cube implements Figure {

    private double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }
}
