package funciones.ejercicio6;

public class Cilindro {
    public static double areaVolumen(double altura, double radio, short opcion) {
        double resultado = switch(opcion){
            case 1: {
                yield (2 * Math.PI * radio * (altura + radio));
            } case 2: {
                yield (Math.PI * Math.pow(radio, 2) * altura);
            }
            default:
                throw new IllegalStateException("Unexpected value: " + opcion);
        };

        return resultado;
    }
}
