package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author 102163 Lisandro Villas Bôas
 */
public class Lambdas {

    private static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public static void main(String[] args) {
        // test1();
        //  test2();
        test3(numbers);
    }

    private static void test1() {

        LambdaInterfaceTeste greetService = (message) -> System.out.println("Hello " + message);
        greetService.sayMessage("blockhead");

    }

    private static void test2() {

//        numbers.forEach((Integer value) -> System.out.println(value));
        //printing with method reference
        numbers.forEach(System.out::println);
    }

    private static void test3(List<Integer> numbers) {
        sumAll(numbers, n -> true);
        sumAll(numbers, n -> n % 2 == 0); // % even numbers
        sumAll(numbers, n -> n > 3);
    }

    public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        System.out.println("Total:" + total);
        return total;
    }

    private static void test4(List<Integer> numbers) {
        System.out.println(
                numbers.stream()
                        .filter(Lazy::isEven)
                        .map(Lazy::doubleIt)
                        .filter(Lazy::isGreaterThan5)
                        .findFirst()
        );
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int doubleIt(int number) {
        return number * 2;
    }

    public boolean isGreaterThan5(int number) {
        return number > 5;
    }

}
