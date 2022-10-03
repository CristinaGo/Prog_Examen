package Ejercicio3;

/**
 * @author Cristina Gómez campos
 */

public class CocheAutomático extends Coche {

    public CocheAutomático(String matricula) {
        super(matricula);
    }

    @Override
    public void acelerar(int k) {
        velocidad = velocidad + k;
        System.out.println("Acelerando");
        System.out.println(toString());

    }

    @Override
    public void frenar(int k) {
        if (velocidad < 0) {
            velocidad = 0;
        } else {
            velocidad = velocidad - k;
        }
        System.out.println("Frenando");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "El vehiculo con matrícula " + this.getMatricula() + " va a " + velocidad + "km/h. Tiene " + this.getPuertas() + " puertas. Es un coche automático.\n";
    }
}
