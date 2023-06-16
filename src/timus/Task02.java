package timus;

public class Task02 {
    public static void main(String[] args) {
        int N = 72; // Входное значение N

        if (N == 0) {
            System.out.println("Минимальное число Q: 10");
        } else if (N == 1) {
            System.out.println("Минимальное число Q: 1");
        } else {
            String result = "";

            for (int i = 9; i >= 2; i--) {
                while (N % i == 0) {
                    result += i;
                    N /= i;
                }
            }

            if (N > 1) {
                System.out.println("Нет возможного значения Q, которое дало бы произведение цифр, равное " + N);
            } else {
                String reversedResult = new StringBuilder(result).reverse().toString();
                System.out.println("Минимальное число Q: " + reversedResult);
            }
        }
    }
}

