class Fusc {

    public static int fusc(int n) {
        if (n == 0) {
            return 0;
        }

        int a = 0;
        int b = 1;
        n -= 1; 
        while (n > 0) {
            if (n % 2 == 0) {
                a = a + b;
                n /= 2;
            } else {
                b = a + b;
                n /= 2;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("fusc(0) = " + fusc(0)); // 0
        System.out.println("fusc(1) = " + fusc(1)); // 1
        System.out.println("fusc(2) = " + fusc(2)); // 1
        System.out.println("fusc(3) = " + fusc(3)); // 2
        System.out.println("fusc(4) = " + fusc(4)); // 1
        System.out.println("fusc(5) = " + fusc(5)); // 3
        System.out.println("fusc(6) = " + fusc(6)); // 2
        System.out.println("fusc(7) = " + fusc(7)); // 3
        System.out.println("fusc(8) = " + fusc(8)); // 1
        System.out.println("fusc(10) = " + fusc(10)); //3
        System.out.println("fusc(15) = " + fusc(15)); // 4
    }
}
