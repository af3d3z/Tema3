package funciones.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do{
            try{
                System.out.println("Introduzca un número:");
                numero = sc.nextInt();
                TablaMultiplicar.imprimirTablaMultiplicar(numero);

                correcto = true;
            }catch(InputMismatchException e){
                System.err.println("Ha introducido un dato incorrecto.");
                sc.nextLine();
            }
        }while(!correcto);
        sc.close();

    }
}
