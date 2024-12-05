
package javaapplication1;

import java.util.Scanner;

public class ejercicio {

    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
        String palabra1,palabra2;
 System.out.println("Menú. 1:Concatenar 2:Número palabras 3:Número letra 4:Salir");
 int eleccion;
 eleccion=sc.nextInt();
 switch (eleccion){
     case 1: System.out.println("Dame una palabra");
             palabra1=sc.nextLine();
             System.out.println("Dame una palabra");
             palabra2=sc.nextLine();
             String concatenar=palabra1+""+palabra2;
             System.out.println(concatenar);
          
     
     case 2:
         
     case 3:
     
     case 4:
 }
    }
}
    

