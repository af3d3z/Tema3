package funciones.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int primerParametro;
        int segundoParametro;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do{
            try{
                System.out.println("Introduzca el primer número:");
                primerParametro = sc.nextInt();

                sc.nextLine();
                System.out.println("Introduzca el segundo número:");
                segundoParametro = sc.nextInt();

                Funcion.mostrarIntermedios(primerParametro, segundoParametro);
                correcto = true;
            }catch(InputMismatchException e){
                System.err.println("El dato introducido es incorrecto.");
                sc.nextLine();
            }
        }while(!correcto);

        sc.close();
    }
}
