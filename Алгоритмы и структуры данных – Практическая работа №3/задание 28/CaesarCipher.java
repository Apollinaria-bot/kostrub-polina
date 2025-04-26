import java.util.Scanner;

public class CaesarCipher {

    public static String encrypt(String text, int shift, String direction) {
        if (direction.equalsIgnoreCase("left")) {
            shift = -shift;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);


            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                // Применяем сдвиг
                ch = (char) ((ch - base + shift + 26) % 26 + base);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для шифрования: ");
        String text = scanner.nextLine();

        System.out.print("Введите число сдвига: ");
        int shift = scanner.nextInt();

        System.out.print("Введите направление (left/right): ");
        String direction = scanner.next();

        String encryptedText = encrypt(text, shift, direction);
        System.out.println("Зашифрованный текст: " + encryptedText);
    }
}