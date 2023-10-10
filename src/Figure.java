public class Figure extends Rectangle implements AreaCalculator{
    @Override
    public double getArea() {
        return this.height * super.width;
    }
}
