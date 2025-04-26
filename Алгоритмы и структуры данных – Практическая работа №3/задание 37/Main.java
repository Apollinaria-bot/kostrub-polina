import java.util.Random;
import java.util.Scanner;

class CodeBreaker {
    private static final int CODE_LENGTH = 4;
    private static final int MAX_ATTEMPTS = 20;

    public static void main(String[] args) {

        String secretCode = generateCode();
        System.out.println("Загадан код из 4-х цифр. Попробуйте угадать его!");

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Введите Ваше предположение (4 цифры): ");
            String guess = scanner.nextLine();

            if (isValidGuess(guess)) {
                attempts++;
                int matches = countMatches(secretCode, guess);
                System.out.println("Количество совпадений: " + matches);

                if (matches == CODE_LENGTH) {
                    System.out.println("Поздравляем! Вы разгадали код: " + secretCode);
                    break;
                }
            } else {
                System.out.println("Некорректный ввод. Убедитесь, что вводите 4 цифры.");
            }
        }

        if (attempts == MAX_ATTEMPTS) {
            System.out.println("Вы исчерпали все попытки. Загаданный код: " + secretCode);
        }

        scanner.close();
    }

    private static String generateCode() {
        Random random = new Random();
        StringBuilder code = new StringBuilder(CODE_LENGTH);

        for (int i = 0; i < CODE_LENGTH; i++) {
            code.append(random.nextInt(10));
        }

        return code.toString();
    }

    private static boolean isValidGuess(String guess) {
        return guess.matches("\\d{4}");
    }

    private static int countMatches(String secretCode, String guess) {
        int matches = 0;
        for (int i = 0; i < CODE_LENGTH; i++) {
            if (secretCode.charAt(i) == guess.charAt(i)) {
                matches++;
            }
        }
        return matches;
    }
}