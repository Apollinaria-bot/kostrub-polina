import java.util.Scanner;

class StickGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long tanyaSticks = 0;

        while (n > 0) {

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }

            tanyaSticks = n;
        }

        System.out.println(tanyaSticks);
    }
}
