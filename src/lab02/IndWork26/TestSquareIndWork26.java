package lab02.IndWork26;

public class TestSquareIndWork26 extends Square{
    public TestSquareIndWork26(double sideLength){
        super(sideLength);
    }
    public static void main(String[] args) {
        Square square = new Square(15);
        System.out.println("Площадь квадрата = " + square.calculateArea());
        System.out.println("Периметр квадрата = " + square.calculatePer());
    }
}