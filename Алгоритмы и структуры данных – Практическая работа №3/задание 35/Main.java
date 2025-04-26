import java.util.Arrays;
import java.util.Comparator;

class FitnessSorting {
    public static void main(String[] args) {
        String input = "56 65 74 100 99 68 86 180 90";
        String[] weights = input.split(" ");

        Arrays.sort(weights, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(sumOfDigits(Integer.parseInt(b)), sumOfDigits(Integer.parseInt(a)));
            }

            private int sumOfDigits(int number) {
                int sum = 0;
                while (number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
                return sum;
            }
        });

        System.out.println(String.join(" ", weights));
    }
}