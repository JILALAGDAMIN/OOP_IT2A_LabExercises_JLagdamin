// Save this file as EXER1_Functional.java

import java.util.*;
import java.util.stream.*;

public class EXER1_Functional {
    public static void main(String[] args) {
        // Example dataset
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Original numbers: " + numbers);

        // Imperative (procedural) style
        List<Integer> evenNumbers1 = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers1.add(num);
            }
        }
        System.out.println("Even numbers (imperative): " + evenNumbers1);

        // Functional style using Streams & Lambdas
        List<Integer> evenNumbers2 = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .toList();

        System.out.println("Even numbers (functional): " + evenNumbers2);

        // Functional style: map + reduce
        int sumOfSquares = numbers.stream()
                                  .map(n -> n * n)         // square each number
                                  .reduce(0, Integer::sum); // sum them up

        System.out.println("Sum of squares (functional): " + sumOfSquares);

        // Functional style: method reference
        long count = numbers.stream()
                            .filter(EXER1_Functional::isPrime) // method reference
                            .count();

        System.out.println("Count of prime numbers (functional): " + count);
    }

    // Helper method to check prime numbers
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(n))
                        .allMatch(div -> n % div != 0);
    }
}
