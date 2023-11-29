package sobrecarga.ejercicio4;

public class Booleanos {
    public static boolean parseToBoolean(int num){
        boolean parsedBoolean = num == 1 ? true : false;
        return parsedBoolean;
    }

    public static boolean parseToBoolean(String str) {
        boolean parsedBoolean = str.equals("true") ? true: false;
        return parsedBoolean;
    }
}
