/*Crea un programa que demani dos números per pantalla, 
els agafi i els mostri indicant: 
“Ha introducido los números X y Z” */
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;
public class E2 {
    //variable loger para registrar errores
     private static final Logger logger = new LoggerUtil(E2.class.getName(), "E2.log").getLogger();
    public static void main (String [] args){
        //las variables que vamos usar, scanner y un array para gestionar la interaccion con el usuario
        Scanner sc=new Scanner(System.in);
        int [] numeros=new int[2];
        try{

        for (int i = 0; i < numeros.length; i++) {

            if (i==numeros.length-1){     //para cambiar el formato de la pregunta, también nos sirve para controlar que metan todos los argumentos
            System.out.println("Mete otro numero");
            numeros[i]=sc.nextInt();
            logger.info("El programa se ha ejectutado correctamente");
            break;
            }
            System.out.println("Mete un numero"); //para introducir el siguiente numero
            numeros[i]=sc.nextInt();
        }
        //excepción por si no se introducen argumentos
    } catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
        logger.severe("No se ha proporciando ningún numero"+arrayIndexOutOfBoundsException.getMessage());
        arrayIndexOutOfBoundsException.printStackTrace();
    } catch(InputMismatchException inputMismatchException){
        /*Los metodos de la clase escaner nextInt(),nextDouble(), nextFloat(), nextLong() lanzan la escecpcion InputMismatchException. Aparece cuando 
        recogen datos en un formato que no es el esperado. Lo lanza todas exceptuando el nextLine(), que lee simplemente
        la entrada de string (aunque nos puede surgir una excepcón si intentamos parsear el string a un numero, excecpción
        que contolaríamos con NumberFormatException). */ 
        logger.severe("Los argumentos introducidos no han sido números"+inputMismatchException.getMessage());
        inputMismatchException.printStackTrace();
    } catch(NullPointerException nullPointerException){
        //excepción por si se introduce un argumento nulo
        logger.severe("El argumento introducido es nulo"+nullPointerException.getMessage());
        nullPointerException.printStackTrace();  
    } catch(Exception exception){
        //excepcion general por si ocurre algo que no somos capaces de preveer
        logger.severe("Ha habido un error"+exception.getMessage());{
        exception.printStackTrace();  
    } 
    }
        System.out.println("Numeros introducidos:"+numeros[0]+","+numeros[1]);
     
    }
}

