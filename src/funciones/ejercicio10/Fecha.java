package funciones.ejercicio10;

public class Fecha {
    public static boolean validarFecha(int dia, int mes, int anio){
        boolean fechaValida = (dia <= 0 || dia > 30) || (mes <= 0 || mes < 12) ? false : true;
        return fechaValida;
    }
}
