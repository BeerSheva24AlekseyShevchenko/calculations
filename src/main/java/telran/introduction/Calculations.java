package telran.introduction;

public class Calculations {
    public static int sum(int op1, int op2) {
        int res = op1 + op2;

        return res;
    }

    public static int subtract(int op1, int op2) {
        int res = op1 - op2;
    
        return res;
    }

    public static int multiply(int op1, int op2) {
        int res = op1 * op2;
    
        return res;
    }

    public static int divide(int op1, int op2) {
        int res = op1 / op2;

        return res;
    }

    public static int sumOfDigits(int op1) {
        if (op1 < 0) {
            op1 = -op1;
        }

        int res = 0;

        while (op1 > 0) {
            res = res + op1 % 10;
            op1 = op1 / 10;
        }

        return res;
    }

    public static int maxOfDigits(int op1) {
        if (op1 < 0) {
            op1 = -op1;
        }

        int res = 0;

        while (op1 > 0) {
            if (op1 % 10 > res) {
                res = op1 % 10;
            }

            op1 = op1 / 10;
        }

        return res;
    }

    public static boolean isDividedOn(int number, int divider) {
        boolean res = number % divider == 0;

        return res;
    }
}
