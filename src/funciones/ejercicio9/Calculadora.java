package funciones.ejercicio9;

public class Calculadora {
    public static double calculadora(short operando, double n1, double n2){
        double resultado = switch(operando){
            case 1 -> {yield(n1 + n2);}
            case 2 -> {yield(n1 - n2);}
            case 3 -> {yield(n1 * n2);}
            case 4 -> {yield(n1 / n2);}
            default -> throw new IllegalStateException("Unexpected value: " + operando);
        };

        return resultado;
    }
}
