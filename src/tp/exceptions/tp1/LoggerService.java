package tp.exceptions.tp1;

import java.io.FileWriter;
import java.io.IOException;

public class LoggerService {
    public static void log (String message){
        try(FileWriter writer = new FileWriter("log.txt", true)){
            writer.write(message + "\n");
        } catch (IOException e) {
            System.out.println("Erreur lors du log");
        }
    }
}
