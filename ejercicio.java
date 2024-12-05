
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
          
     
     case 2: System.out.print("Ingrese una frase: ");
     palabra1=sc.nextLine();
     if (palabra1.trim().isEmpty()) {
            System.out.println("La frase no contiene palabras.");
        } else {
            String[] palabras = palabra1.trim().split("\\s+");
            int numeroDePalabras = palabras.length;

            System.out.println("La frase contiene " + numeroDePalabras + " palabras.");
         
     case 3: System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        System.out.print("Ingrese una letra para buscar: ");
        String letraInput = sc.nextLine();
       if (letraInput.length() != 1) {
            System.out.println("Por favor, ingrese solo una letra.");
        } else {
            char letra = letraInput.charAt(0);
            int contador = 0;

            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == letra) {
                    contador++;
                }
            }
            System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
       }
       break;
         
<<<<<<< HEAD
     case 4:
=======
     case 3:
     
     case 4: System.out.println("Saliste correctamente");
        break;
>>>>>>> rama4
 }
    }
}

    

