import java.util.Scanner;

class SticksGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество палочек (n): ");
        long n = scanner.nextLong();

        while (n > 0) {
            if (n % 2 == 0) {

                System.out.println("Текущий игрок может взять 1 палочку или " + (n / 2) + " палочек.");

                n /= 2;
            } else {

                System.out.println("Текущий игрок может взять 1 палочку.");
                n -= 1;
            }
            System.out.println("Осталось палочек: " + n);
        }

        System.out.println("Палочек больше нет. Игра окончена.");
        scanner.close();
    }
}