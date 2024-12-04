
package javaapplication1;
import java.util.Scanner;
public class newJavaFile {
public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
System.out.println("Menú. 1:Sumar 2:Restar 3:Multiplicar 4:Dividir");
int menu=sc.nextInt();
int num1,num2;
switch(menu){
    case 1: 
        break;
    case 2:
        break;
    case 3: System.out.println("Introduce el primer número");
            num1=sc.nextInt();
            System.out.println("Introduce el segundo número");
            num2=sc.nextInt();
        break;
    case 4:
        break;
}
    }
}

