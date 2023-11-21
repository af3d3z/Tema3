package ejercicio5;

public class TablaMultiplicar {
    public static void imprimirTablaMultiplicar(int n) {
        System.out.printf("TABLA DEL %d\n", n);
        for(int i = 0; i <= 10; i++){
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
    }
}
