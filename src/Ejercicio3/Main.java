package Ejercicio3;

/**
 * @author Cristina Gómez campos
 */

public class Main {
    public static void main(String[] args) {

        CocheAutomático coche1 = new CocheAutomático("AUT0001");
        System.out.println("Se ha creado el vehículo con matrícula: " + coche1.getMatricula());

        CocheManual coche2 = new CocheManual("MAN0001");
        System.out.println("Se ha creado el vehículo con matrícula: " + coche2.getMatricula());

        coche1.setPuertas(2);
        coche2.setPuertas(4);


        coche1.acelerar(20);
        coche2.acelerar(20); //las marchas no se asignan bien. ¿problema en método cambiarmarcha?
        coche2.acelerar(10);
        coche2.acelerar(10);
        coche2.acelerar(10);
        coche2.acelerar(10);
        coche2.acelerar(10);
        coche2.acelerar(10);
        coche2.acelerar(10);
        coche2.acelerar(10);
        coche2.frenar(100);
        coche1.frenar(20);


    }
}
