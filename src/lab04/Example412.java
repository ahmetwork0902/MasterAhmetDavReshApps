package lab04;

public class Example412 {
    public class Main {
        public static void m(String str, double chislo) {
            if (str == null) {
                throw new IllegalArgumentException("Строка введе-на неверно");
            }
            if (chislo > 0.001) {
                throw new IllegalArgumentException("Неверное чис-ло");
            }
        }

        public static void main(String[] args) {
            m(null, 0.000001);
        }
    }
}
