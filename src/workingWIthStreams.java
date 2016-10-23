import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class workingWIthStreams {
    public static void main(String[] arg){
        List<String> myList = Arrays.asList("a1", "a2", "b1", "b2", "c1", "c2");

        myList
                .stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        Arrays.asList("text1", "text2", "text3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);


        Stream.of("b1", "b2", "b3")
                .findFirst()
                .ifPresent(System.out::println);


        IntStream.range(1, 4)
                .forEach(System.out::println);


        Arrays.stream(new int[] {1,2,3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);


    }
}
