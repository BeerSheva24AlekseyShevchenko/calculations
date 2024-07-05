package telran.introduction;

final public class Calculations {
    private Calculations() {}

    /**
     * Returns the sum of the arguments.
     */
    public static int sum(int op1, int op2) {
        int res = op1 + op2;

        return res;
    }

    /**
     * Returns the difference of the arguments.
     */
    public static int subtract(int op1, int op2) {
        int res = op1 - op2;
    
        return res;
    }

    /**
     * Returns the product of the arguments.
     */
    public static int multiply(int op1, int op2) {
        int res = op1 * op2;
    
        return res;
    }

    /**
     * Returns the quotient of the arguments.
     */
    public static int divide(int op1, int op2) {
        int res = op1 / op2;

        return res;
    }

    /**
     * Returns the absolute value of the argument.
     */
    public static int abs(int op1) {
        int res = op1 < 0 ? -op1 : op1;

        return res;
    }

    /**
     * Returns the sum of the digits in the argument.
     */
    public static int sumOfDigits(int op1) {
        op1 = abs(op1);

        int res = 0;

        while (op1 > 0) {
            res = res + op1 % 10;
            op1 = op1 / 10;
        }

        return res;
    }

    /**
     * Returns the maximum digit of the argument.
     */
    public static int maxOfDigits(int op1) {
        op1 = abs(op1);

        int res = 0;

        while (op1 > 0) {
            if (op1 % 10 > res) {
                res = op1 % 10;
            }

            op1 = op1 / 10;
        }

        return res;
    }

    /**
     * Checks whether a number can be divided without a remainder.
     */
    public static boolean isDividedOn(int number, int divider) {
        boolean res = number % divider == 0;

        return res;
    }
}
