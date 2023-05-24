package lab02;
public class Example22 {
    public static String getEncryptString(String encryptString, int shift){

        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++){
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);
        return encryptString;
    }

    //Добавочный метод для работы класса шифрования:
    public static void main(String[] args) {
        String message = "Привет мир от Ахмета Давлятшина!";
        int shift = 5;

        String encryptedMessage = getEncryptString(message, shift);
        System.out.println("Зашифрованное сообщение: " + encryptedMessage);
    }
}

