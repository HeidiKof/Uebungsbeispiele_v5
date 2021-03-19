package rekursion;

public class ZiffernsummeRekursiv {
    public static void main(String[] args) {

        System.out.println(getDigitSum(5));
        System.out.println("getDigitSum(5) = " + getDigitSum(5));
        System.out.println("getDigitSum(125) = " + getDigitSum(125));
        System.out.println("getDigitSum(12345) = " + getDigitSum(12345));

        for (int i = 1; i <= 25; i++) {
            System.out.println("fibonacci(" + i + ") = " + fibonacci(i));
        }

        System.out.println("getPower(2,3) = " + getPower(2, 3));
        System.out.println("multiply(7,5) = " + multiply(7, 5));

    }

    public static int getDigitSum(int number) {
        if (number < 10) {
            return number;
        } else {
            int lastNumber = number % 10;
            number = number / 10;
            return lastNumber + getDigitSum(number);
        }
    }

    //public static int getDigtiSumLimited(int number) {}

    public static int getPower(int a, int b) {
        if (b < 2) {
            return a;
        } else {
            return a * getPower(a, b - 1);
        }
    }

    public static int multiply(int a, int b) {

        if (b >= 1 && a >= 1) {
            return a + multiply(a, b - 1);
        }
        return 0;

    }

    public static int fibonacci(int a) {
        if (a == 0) {
            return 0;
        } else if (a <=2) {
            return 1;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }

    }
}

