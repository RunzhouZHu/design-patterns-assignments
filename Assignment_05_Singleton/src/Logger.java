import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private String fileName;
    private static Logger instance = new Logger();
    private Logger() {
        this.fileName = "default_log.txt";
    }
    public static Logger getInstance() {
        return instance;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void write(String log){
        try (FileWriter writer = new FileWriter(fileName, true);) {
            writer.write(log + "\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close(){
        instance.close();
    }

}
