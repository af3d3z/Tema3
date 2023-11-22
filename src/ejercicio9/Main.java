package ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double operando = 0;
        double n1, n2;
        Scanner sc = new Scanner(System.in);

        do{
            try{
                System.out.println("/*****CALCULADORA*****\\");
                System.out.println("Elige una opción:");
                System.out.print("1. Sumar.\n2. Restar.\n3. Multiplicar.\n4. Dividir");
            }catch(InputMismatchException e){
                System.err.println("Dato incorrecto.");
            }
        }while(operando <= 0 || operando > 4);
    }
}
