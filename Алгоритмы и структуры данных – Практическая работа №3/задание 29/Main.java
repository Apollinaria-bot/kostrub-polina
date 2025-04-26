import java.util.Scanner;

class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для шифрования: ");
        String input = scanner.nextLine();

        System.out.print("Введите число сдвига: ");
        int shift = scanner.nextInt();

        System.out.print("Введите направление (1 для вправо, -1 для влево): ");
        int direction = scanner.nextInt();

        String result = caesarCipher(input, shift * direction);
        System.out.println("Зашифрованная строка: " + result);
    }

    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        shift = shift % 26 + 26;

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) ((character - base + shift) % 26 + base);
            }
            result.append(character);
        }

        return result.toString();
    }
}
