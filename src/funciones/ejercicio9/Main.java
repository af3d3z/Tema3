package funciones.ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short operando = 0;
        double n1 = 0;
        double n2 = 0;
        double resultado;
        Scanner sc = new Scanner(System.in);

        do{
            try{
                System.out.println("/*****CALCULADORA*****\\");
                System.out.println("Elige una opción:");
                System.out.print("1. Sumar.\n2. Restar.\n3. Multiplicar.\n4. Dividir\n");
                operando = sc.nextShort();
            }catch(InputMismatchException e){
                System.err.println("Dato incorrecto.");
            }
        }while(operando <= 0 || operando > 4);

        do{
            try{
                System.out.println("Ingresa el primer número:");
                n1 = sc.nextDouble();
            }catch (InputMismatchException e) {
                System.err.println("Dato incorrecto. Inténtelo de nuevo.");
            }
        }while(n1 == 0);

        do{
            try{
                System.out.println("Ingresa el segundo número:");
                n2 = sc.nextDouble();
            }catch(InputMismatchException e) {
                System.err.println("Dato incorrecto. Inténtelo de nuevo.");
            }
        }while(n2 == 0);

        resultado = Calculadora.calculadora(operando, n1, n2);
        System.out.printf("Resultado: %.02f", resultado);

        sc.close();
    }
}
