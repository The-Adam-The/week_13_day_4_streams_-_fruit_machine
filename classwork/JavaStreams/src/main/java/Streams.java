import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Streams {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("amanda", "alex", "sandy", "alina", "sky");

        myList
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        //reduce
        System.out.println("reduce function: ");
        int total = Stream.of(1, 2, 3, 4, 5, 6, 7)
                .reduce(0, (sum, num) -> sum += num);
        System.out.println(total);
        System.out.println("\n");

        //map
        System.out.println("map function: ");
        Stream.of(1, 2, 3, 4, 5, 6, 7)
                .filter((num) -> num %2 == 0)
                .forEach(System.out::println);
        System.out.println("\n");


        //filter
        System.out.println("filter function: ");
        Stream.of(1, 2,  3, 4, 5, 6, 7, 8)
                .filter((num) -> num % 2 == 0)
                .forEach(System.out::println);
        System.out.println("\n");

        //sorted
        System.out.println("sorted function: ");
        Stream.of(99, 3, 61, 20, 83, 12, 2, 18, 10)
                .sorted()
                .limit(4)
                .forEach(System.out::println);
        System.out.println("\n");

        //limit
        System.out.println("limit function: ");
        Stream.of(99, 3, 61, 20, 83, 12, 2, 18, 10)
                .sorted()
                .limit(4)
                .forEach(System.out::println);
        System.out.println("\n");

        //average
        System.out.println("average function: ");
        OptionalDouble average = Stream.of(99, 3, 61, 20, 83, 12, 2, 18, 10)
                .mapToInt((n) -> n)
                .average();
        System.out.println(average);
        System.out.println("\n");

        //min
        System.out.println("min function: ");
        int minResult = Stream.of(99, 3, 61, 20, 83, 12, 2, 18, 10)
                .mapToInt((n) -> n)
                .min().getAsInt();
        System.out.println(minResult);
        System.out.println("\n");

        //max
        System.out.println("max function: ");
        int maxResult = Stream.of(99, 3, 61, 20, 83, 12, 2, 18, 10)
                .mapToInt((n) -> n)
                .max().getAsInt();
        System.out.println(minResult);
        System.out.println("\n");

        //peek
        System.out.println("peek function: ");
        int out = IntStream.of(99, 3, 61, 20, 83, 12, 2, 18, 10)
                .peek(n -> System.out.printf("original: $d%n", n))
                .map(n -> n * 2)
                .peek(n -> System.out.printf("double : %d%n", n))
                .filter(n -> n % 3 ==0)
                .peek(n -> System.out.printf("filtered: $d%n", n))
                .sum();
        System.out.println(out);
        System.out.println("\n");

        //IntStream
        System.out.println("IntStream: ");
        IntStream.range(1, 5)
                .mapToObj(num -> "number: " + num)
                .forEach(System.out::println);
        System.out.println("\n");


    }




}
