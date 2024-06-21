import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
//Crea un programa que mostri per pantalla  “Hello World!
public class E1 {

   // Obtener una instancia de Logger para esta clase
  private static final Logger logger = new LoggerUtil(E1.class.getName(), "E1.log").getLogger();
  public static void main (String [] args){

    try {
      PrintWriter writer = new PrintWriter(System.out, true);
      writer.println("HelloWorld");
      logger.info("Ejercicio E1 realizado con éxito");
      
    } 
    catch(NullPointerException nullPointerException){
      System.err.println("El login no esta correctamente iniciado");
      logger.severe("Ha habido un error con el inicio del login");
    }
    
    catch (Exception e) {

      e.printStackTrace();
      logger.severe("Ha habido un error con la ejecución del ejercicio E1");
    }
  


  
}

}


