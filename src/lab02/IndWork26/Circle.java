package lab02.IndWork26;

// Класс круга
public class Circle implements IndWork26 {
    private double radius;
    // Конструктор, позволяющий создавать объекты класса Circle
    public Circle(double radius) {
        this.radius = radius;
    }
    // Переопределение метода расчёта площади
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    // Переопределение метода расчёта периметра
    @Override
    public double calculatePer() {
        return 2 * Math.PI * radius;
    }
}
