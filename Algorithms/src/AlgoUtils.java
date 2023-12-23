import java.lang.reflect.Array;

public class AlgoUtils {
    // Метод пошуку мінімального елементу в масиві позитивних чисел
    public static int findMinPositive(int[] array) {
        int minPositive = Integer.MAX_VALUE;

        for (int num : array) {
            if (num > 0 && num < minPositive) {
                minPositive = num;
            }
        }

        return minPositive;
    }

    // Метод для розрахунку суми елементів масиву, який може складатися лише з від’ємних чисел
    public static int calculateSumOfNegatives(int[] array) {
        int sumOfNegatives = 0;

        for (int num : array) {
            if (num < 0) {
                sumOfNegatives += num;
            }
        }

        return sumOfNegatives;
    }

    // Метод для розрахунку N-го елементу послідовності Фібоначчі
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Метод для розрахунку сили струму на ділянці кола
    public static double calculateCurrent(double voltage, double resistance) throws ArithmeticException {
        if(resistance == 0.0)
            throw new ArithmeticException("Division by Zero");

        return voltage / resistance;
    }
}
