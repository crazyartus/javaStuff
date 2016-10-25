package someFreeCode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Pierwszy sposob wyciagniecia danych z pliku tekstowego.
//        List<String> list = new ArrayList<>();
//
//        try (Stream<String> stream = Files.lines(Paths.get(file.getPath()))) {
//            list = stream
//                    .filter(line -> line.startsWith("[userName]"))
//                    .map(String::toUpperCase)
//                    .collect(Collectors.toList());
//        }
//
//        System.out.println("zawartosc listy:");
//        list.forEach(System.out::println);



public class workingWithFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/lila/Pulpit/file.txt");

        List<String> dane = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(file.getPath()))) {

            dane = stream.filter (wiersz -> wiersz.startsWith("[userName]"))
                         .map(String::toLowerCase)

                         .collect(Collectors.toList());
        }

        dane.forEach(System.out::println);


    }
}