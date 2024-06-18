/*Crea un programa que demani dos números per pantalla, 
els agafi i els mostri indicant: 
“Ha introducido los números X y Z” */
import java.util.Scanner;
public class E2 {
    public static void main (String [] args){
        int n1;
        int n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("n1:");
        n1=sc.nextInt();
        System.out.println("n2:");
        n2=sc.nextInt();
        System.out.println(n1+" "+n2);
    }
}
