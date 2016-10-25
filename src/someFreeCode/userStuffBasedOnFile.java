package someFreeCode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lila on 23.10.16.
 */
public class userStuffBasedOnFile {
    public static void main(String[] arg) throws IOException {

        //zebranie danych - jaki os i sciezka do zapisu pliku.
        String javaVersion = System.getProperty("java.version");
        String workingDir = System.getProperty("user.dir");
        String userHomeDir = System.getProperty("user.home");
        String myOs = System.getProperty("os.name");

        //create new file with settings saved
        String fileName = " file.txt";
        File file  = new File("/home/lila/Pulpit/file.txt");

        try {
            if (file.createNewFile()){
                System.out.println("File created.");
            }else {
                System.out.println(" File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("info odnosnie systemu.");
        System.out.println("1) Working directory: " + workingDir);
        System.out.println("2) Home directory: " + userHomeDir);
        System.out.println("3) Current OS is " + myOs);
        System.out.println("4) JRE:  " + javaVersion);


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


        //Drugi sposob na odczyt pliku tekstowego.

        String filenameWithPath = file.getPath();
        try (Stream<String> stream = Files.lines(Paths.get(filenameWithPath))) {
            stream.forEach(System.out::println);
        }catch(IOException fileError){
            fileError.getMessage();
        }


        //zapisywanie do pliku tekstowego.



    }
}
