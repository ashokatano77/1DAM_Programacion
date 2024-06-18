import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {
    private static FileHandler fileHandler;
    private Logger logger;

    public LoggerUtil(String className, String fileHandlerPattern ){
    
        try {
            // Configurar el FileHandler para escribir en un archivo
            fileHandler = new FileHandler(fileHandlerPattern, true);
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger = Logger.getLogger(className);
        logger.addHandler(fileHandler);

    }

    public Logger getLogger() {
        return logger;
    }

}
