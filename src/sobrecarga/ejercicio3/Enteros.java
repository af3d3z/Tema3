package sobrecarga.ejercicio3;

public class Enteros {
    // suma de todos los numeros desde 1 hasta n
    public static int sumaEnteros(int n) {
        int sumaTotal = 0;

        for(int i = 1; i <= n; i++){
            sumaTotal += i;
        }

        return sumaTotal;
    }

    //suma de todos los numeros desde x a n
    public static int sumaEnteros(int x, int n) {
        int sumaTotal = 0;

        if (x > n) {
            for (int i = n; i <= x; i++) {
                sumaTotal += i;
            }
        } else {
            for (int i = x; i <= n; i++) {
                sumaTotal += i;
            }
        }

        return sumaTotal;
    }
}
