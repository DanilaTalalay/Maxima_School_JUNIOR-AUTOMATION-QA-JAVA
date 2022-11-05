package geometrypackage;

public class Rhombus implements Shape{
    public Rhombus() { diagonal = 0; }

    public Rhombus(double _diagonal) {
        diagonal = _diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    @Override
    public double getArea() {
        return (2 / (diagonal * diagonal));
    }

    private double diagonal;
}
