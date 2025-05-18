import java.util.Scanner;

public class YearConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число лет (от 1 до 10000): ");
        int number = scanner.nextInt();

        if (number <= 1 || number >= 10000) {
            System.out.println("Число должно быть в диапазоне 1 < n < 10000.");
            return;
        }

        String romanNumeral = convertToRoman(number);
        System.out.println("Римское представление: " + romanNumeral);
    }

    private static String convertToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM", "MMMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder result = new StringBuilder();

        int thou = num / 1000;
        int hund = (num % 1000) / 100;
        int ten = (num % 100) / 10;
        int one = num % 10;

        result.append(thousands[thou]);
        result.append(hundreds[hund]);
        result.append(tens[ten]);
        result.append(ones[one]);

        return result.toString();
    }
}