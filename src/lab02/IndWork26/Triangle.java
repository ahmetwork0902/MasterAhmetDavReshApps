package lab02.IndWork26;

// Класс треугольника
public class Triangle implements IndWork26 {
    private double side1;
    private double side2;
    private double side3;
    // Конструктор, позволяющий создавать объекты класса Triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // Переопределение метода расчёта площади
    @Override
    public double calculateArea() {
        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }
    // Переопределение метода расчёта перриметра
    @Override
    public double calculatePer() {
        return side1 + side2 + side3;
    }
}
