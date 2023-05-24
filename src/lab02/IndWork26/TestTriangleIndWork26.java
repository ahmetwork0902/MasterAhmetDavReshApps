package lab02.IndWork26;

public class TestTriangleIndWork26 extends Triangle{
    public TestTriangleIndWork26(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(9, 8, 7);
        System.out.println("Площадь треугольника = " + triangle.calculateArea());
        System.out.println("Периметр треугольника = : " + triangle.calculatePer());
    }
}
