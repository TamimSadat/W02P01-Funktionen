package pgdp.functions;

import java.util.logging.StreamHandler;

public class Functions {

    public static int square(int n) {
        int square = n * n;
        return square;
    }

    public static int sumOfSquares(int a, int b) {
        int aSquared = square(a);
        int bSquared = square(b);
        int sum = aSquared + bSquared;

        return sum;
    }

    public static int cube(int n) {
        // TODO
        n = n * n * n;
        return n;
    }

    public static int average(int a, int b, int c) {
        // TODO
        int x;
        x = (a + b + c) / 3;
        return x;
    }

    public static boolean isPythagoreanTriple(int a, int b, int c) {
        // TODO: Benutze in dieser Methode keine arithmetischen Operatoren (i.e. +, -, *, /, % etc.)!
        if (sumOfSquares(a, b) == square(c)) {
            return true;
        }
        else {
            return false;
        }


    }
}
