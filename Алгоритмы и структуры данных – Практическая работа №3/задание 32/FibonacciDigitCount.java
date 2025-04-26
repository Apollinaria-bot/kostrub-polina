import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciDigitCount {

    public static void main(String[] args) {
        int i = 10;
        BigInteger fibNumber = fibonacci(i);
        System.out.println("F(" + i + ") = " + fibNumber);
        System.out.println("Наибольшее количество вхождений цифры: " + countDigitOccurrences(fibNumber));
    }


    public static BigInteger fibonacci(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger fib = BigInteger.ZERO;

        for (int j = 2; j <= n; j++) {
            fib = a.add(b);
            a = b;
            b = fib;
        }

        return fib;
    }


    public static String countDigitOccurrences(BigInteger number) {
        String numStr = number.toString();
        Map<Character, Integer> digitCount = new HashMap<>();


        for (char digit : numStr.toCharArray()) {
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
        }


        char maxDigit = '0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : digitCount.entrySet()) {
            char digit = entry.getKey();
            int count = entry.getValue();
            
            if (count > maxCount || (count == maxCount && digit < maxDigit)) {
                maxCount = count;
                maxDigit = digit;
            }
        }

        return String.format("(%d, %c)", maxCount, maxDigit);
    }
}