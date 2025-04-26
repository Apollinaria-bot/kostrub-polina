import java.util.Scanner;

class PowerSumCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное число: ");
        int number = scanner.nextInt();

        System.out.print("Введите число для начала ряда: ");
        int start = scanner.nextInt();

        if (checkPowerSum(number, start)) {
            System.out.println("Сумма последовательных степеней равна произведению числа на множитель.");
        } else {
            System.out.println("Сумма последовательных степеней не равна произведению числа на множитель.");
        }

        scanner.close();
    }

    private static boolean checkPowerSum(int number, int start) {
        int sum = 0;
        int temp = number;
        int digitCount = 0;


        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }


        temp = number;
        for (int i = 0; i < digitCount; i++) {
            int digit = temp % 10;
            sum += Math.pow(digit, start + i);
            temp /= 10;
        }

        return sum == number * (1 << 6); // 1 << 6 это 2^6
    }
}
