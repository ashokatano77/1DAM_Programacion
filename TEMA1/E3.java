import java.io.IOException;
import java.util.Scanner;

/* Crea un programa que demani a l’usuari un número 
i te mostri per pantalla el doble i el triple d’aquell número*/

public class E3{
    public static void main (String [] args){
        //el programa se ejecuta por linea de comandos
        if (args.length != 1 ){  //debemos introducir el numero deseado por linea de comandos, como dice el ejemplo de abajo
            System.out.println("debes introducri al menos 1 argumentos ej: java E3.java 3");
            System.exit(1); //de no hacerse así el programa saldrá dando un código de error 1, que nos indica que hubo un error
        }

        try{ 
            int num=Integer.parseInt(args[0]);//parseamos el argumento porque nos vendrá en formato string
            System.out.println("doble: "+(num*2)+" triple: "+(num*3)); //realizamos la operacion
            
            //vamos a poner las expcecpiones, de más específica a más general
            
            //EXCECPCIÓN 1 Controlar que el argumento sea un número
        } catch(NumberFormatException numberFormatException){ //excecpion que controla que hayamos metido un numero, aunque sea en formato string
            System.out.println("No se ha introducido un número válido");
            numberFormatException.printStackTrace();//imprimimos la traza de pila que nos dará más información
           
            //EXCEPCIÓN 2 Controlar que nos metan un argumentp
        } catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("No se ha proporcionado ningún número");
            arrayIndexOutOfBoundsException.printStackTrace();
        } 
        // EXCECPCIÓN 3 Controlar cualquier otra que pueda haber
        catch(Exception exception){
            System.out.println("Ocurrio algún error");
            exception.printStackTrace();
        }

      

    }

}