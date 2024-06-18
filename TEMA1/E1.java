import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
//Crea un programa que mostri per pantalla  “Hello World!
public class E1 {

   // Obtener una instancia de Logger para esta clase
  private static final Logger logger = new LoggerUtil(E1.class.getName(), "E1.log").getLogger();
  public static void main (String [] args){

    try {
      System.out.println("HelloWorld");
      logger.info("programa realizado con éxito");
      
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
      logger.severe("El programa ha sufrido un error");
    }
  


  
}

}


