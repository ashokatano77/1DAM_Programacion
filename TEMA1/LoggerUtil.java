import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 Usamos logger para hacer un registro del funcionamiento de las aplicaciones
 Es útil para ir contrlando que vaya bien la aplicación.
 El estandar para comunicar mensajes logger que se usa es el siguiente:
 -SEVERE: errores graves
 -WARNING: problema potencial
 -INFO: información general sobre el funcionamiento del programa
 -CONFIG: sobre la configuración del programa
 -FINE: detalles finos sobre puntos del flujo de ejecución del programa
 -FINER: detalles más finos 
 -FINEST: los detalles más finos posibles

 El logger registrará la fecha y el mensaje que pongamos en el punto concreto del programa, y lo escribirá en un archivo que irá acumulando la infromación. 
 Nos sirve para tener un registro del funcionamiento de la aplicaciñón.
 */
public class LoggerUtil {
    // FileHandler se usa para escribir los registros en un archivo
    private static FileHandler fileHandler;

    // Logger para la clase específica
    private Logger logger;

    // Constructor que configura el Logger para una clase específica
    public LoggerUtil(String className, String fileHandlerPattern ) {
        try {
            // Configurar el FileHandler para escribir en un archivo especificado por fileHandlerPattern
            // El segundo parámetro 'true' indica que los registros se agregarán al archivo en lugar de sobrescribirlo
            fileHandler = new FileHandler(fileHandlerPattern, true);
            // Establecer un formato simple para los registros
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            // Manejar la excepción de E/S y mostrar la traza de la pila
            e.printStackTrace();
        }
        // Obtener un Logger para la clase específica usando el nombre de la clase
        logger = Logger.getLogger(className);
        // Añadir el FileHandler al Logger para que los registros se escriban en el archivo
        logger.addHandler(fileHandler);
    }

    // Método para obtener el Logger configurado
    public Logger getLogger() {
        return logger;
    }
}
