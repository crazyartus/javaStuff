import java.io.File;
import java.io.IOException;

/**
 * Created by lila on 23.10.16.
 */
public class userStuffBasedOnFile {
    public static void main(String[] arg){

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

        System.out.println("1) Working directory: " + workingDir);
        System.out.println("2) Home directory: " + userHomeDir);
        System.out.println("3) Current OS is " + myOs);
        System.out.println("4) JRE:  " + javaVersion);
    }
}
