package lab04;

public class Example41 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw  new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) { // исключение перехвачено
            System.out.println("1  "+ e);  // исключение обрабо-тано
        }
        System.out.println("2");
    }
}