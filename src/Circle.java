public class Circle extends Rectangle implements AreaCalculator{
    private Double radius;
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
