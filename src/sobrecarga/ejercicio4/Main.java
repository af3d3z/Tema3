package sobrecarga.ejercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println(Booleanos.parseToBoolean("true"));
        System.out.println(Booleanos.parseToBoolean("false"));
        System.out.println(Booleanos.parseToBoolean(1));
        System.out.println(Booleanos.parseToBoolean(0));
    }
}
