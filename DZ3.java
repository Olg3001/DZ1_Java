// Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

import java.util.ArrayList;
import java.util.List;

public class DZ3 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            boolean PrimeInteger = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    PrimeInteger = false;
                    break;
                }
            }
            if (PrimeInteger) {
                nums.add(i);
            }
        }
        System.out.println("Prime Integers from 1 up to 1000 are:" + nums);
    }
}