package theme7.task2;

public class Ball implements Figure {

    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}
