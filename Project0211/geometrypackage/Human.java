package geometrypackage;

public class Human implements Shape{
    public Human() { growth = 0; }

    public Human(double _growth, double _weight){
        growth = _growth;
        weight = _weight;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    public double getGrowth() {
        return growth;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getArea() {
        return Math.sqrt((growth * weight) / MOSTLER);
    }
    static final double MOSTLER =3600;
    private double growth;
    private double weight;
}
