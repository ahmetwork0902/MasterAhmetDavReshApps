package lab02.IndWork26;

public class TestCircleIndWork26 extends Circle{
    public TestCircleIndWork26(double radius) {
        super(radius);
    }
    public static void main(String[] args) {
        Circle circle = new Circle(11);
        System.out.println("Площадь круга = " + circle.calculateArea());
        System.out.println("Периметр круга = " + circle.calculatePer());
    }
}

