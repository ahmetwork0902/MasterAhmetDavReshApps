package lab04;

public class Example48 {
    public static class Main {
        public static int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } finally {
                System.out.println("1");
            }
        }

        public static void main(String[] args) {
            try {
                System.out.println(m());
            } catch (RuntimeException e) {
                System.out.println("Exception caught: " + e);
            }
        }
    }
}
