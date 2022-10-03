import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author Cristina Gómez campos
 */

public class Ejercicio2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int edad = pedirEdad();
        String tipo = devolverTipo(edad);
        int precio = calcularPrecio(tipo);
        imprimirTicket(tipo, precio);

    }

    public static int pedirEdad() {
        System.out.println("Introduce la edad");
        int edad = sc.nextInt();
        return edad;
    }

    public static String devolverTipo(int edad) {
        String tipo;
        if (edad >= 18) {
            tipo = "Adulto";
        } else {
            tipo = "Niño";
        }
        return tipo;
    }

    public static int calcularPrecio(String tipo) {
        int precio = 0;
        if (tipo.equals("Adulto")) {
            precio = 4;
        } else if (tipo.equals("Niño")) {
            precio = 2;
        }
        return precio;
    }

    public static void imprimirTicket(String tipo, int precio) {
        System.out.println("TICKET DE ENTRADA");
        System.out.println(tipo + "   " + "Precio: " + precio);
    }
}
