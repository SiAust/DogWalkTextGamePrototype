import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TooManyListenersException;

public class OutputLogger {
    File log;
    FileWriter fw;

    public OutputLogger() {
        log = new File("log.txt");
        try {
            fw = new FileWriter("log.txt");
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void printAndLog(String s) {
        try {
            fw.write(s + "\n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
