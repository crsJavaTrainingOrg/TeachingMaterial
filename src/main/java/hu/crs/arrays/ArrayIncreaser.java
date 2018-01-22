package hu.crs.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayIncreaser {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int i = 0;
        while (ThreadLocalRandom.current().nextInt(0, 1000) != 0) {
            if (i < numbers.length - 1) {
                numbers[i] = 1;
            } else {
                int[] numbersIncreased = new int[numbers.length * 2];
                System.arraycopy(numbers, 0, numbersIncreased, 0, numbers.length);
                numbers = numbersIncreased;
                numbers[i] = 1;
            }
            i++;
        }
        System.out.println(Arrays.stream(numbers)
                .filter(v -> v == 1)
                .count());
    }
}
