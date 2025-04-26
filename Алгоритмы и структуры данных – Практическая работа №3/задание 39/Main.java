import java.util.Scanner;

class TextTransformer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();

        String transformedText = transformText(inputText);
        System.out.println("Измененный текст:");
        System.out.println(transformedText);
    }

    private static String transformText(String text) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split("(?<=\\W)|(?=\\W)");

        for (String word : words) {
            if (word.matches("[a-zA-Zа-яА-ЯёЁ]+")) {

                String transformedWord = word.substring(1) + word.charAt(0) + "ауч";
                result.append(transformedWord);
            } else {

                result.append(word);
            }
        }

        return result.toString();
    }
}