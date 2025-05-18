import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToArabicConverter {

    private static Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static int romanToInt(String roman) {
        int total = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char ch = roman.charAt(i);
            int value = romanMap.get(ch);
            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            prevValue = value;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите римское число, обозначающее количество лет (от 1 до 10000): ");
        String romanNumber = scanner.nextLine().toUpperCase().trim();

        int n = romanToInt(romanNumber);

        if (n > 1 && n < 10000) {
            System.out.println("Арабское число: " + n);
        } else {
            System.out.println("Значение выходит за допустимый диапазон (1 < n < 10000).");
        }

        scanner.close();
    }
}