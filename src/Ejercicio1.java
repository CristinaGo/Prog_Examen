import java.util.Scanner;

/**
 * @author Cristina Gómez Campos
 */

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean c = false;
        do {
            comprobarCodigo();
            System.out.println("¿Salir?(s/n)");
            char res = sc.next().toLowerCase().charAt(0);
            if (res == 'n') {
                c = true;
            } else {
                c = false;
            }
        } while (c);
    }

    public static void comprobarCodigo() {
        System.out.println("Introduce un código");
        String codigo = sc.next();
        if (codigo.length() == 9) {
            System.out.println("El número de caracteres introducidos " + codigo.length() + " no es correcto");
            System.out.println("Un código SWIFT tiene 8 u 11 caracteres");
        } else if (codigo.length() == 12) {
            System.out.println("El número de caracteres introducidos " + codigo.length() + " no es correcto");
            System.out.println("Un código SWIFT tiene 8 u 11 caracteres");
        } else {
            System.out.println("CÓDIGO SWIFT" + codigo + ":");
            System.out.println("===============================");
            String subcadena = codigo.substring(4, 6);
            String subcadena2 = codigo.substring(6, 8);
            if (subcadena.equals("ES") && subcadena2.equals("MM")) {
                System.out.println("País: " + subcadena);
                System.out.println("Localidad: Madrid");
            } else if (subcadena.equals("RU") && subcadena2.equals("MM")) {
                System.out.println("País: " + subcadena);
                System.out.println("Localidad: Moscú");
            } else {
                System.out.println("País: " + subcadena);
            }
        }
    }
}
