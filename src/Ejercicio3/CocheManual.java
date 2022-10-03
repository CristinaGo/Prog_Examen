package Ejercicio3;

/**
 * @author Cristina Gómez campos
 */

public class CocheManual extends Coche {
    private int marcha;


    public CocheManual(String matricula) {
        super(matricula);
        this.marcha = 0;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void cambiarMarcha(int v) {
        if (v < 10) {
            marcha = 1;
        } else if (v >= 10 && v <= 30) {
            marcha = 2;
        } else if (v >= 31 && v <= 50) {
            marcha = 3;
        } else if (v >= 51 && v <= 80) {
            marcha = 4;
        } else {
            marcha = 5;
        }
    }

    @Override
    public void acelerar(int k) {
        velocidad = velocidad + k;
        System.out.println("Acelerando");
        System.out.println(toString());
        cambiarMarcha(velocidad);
    }

    @Override
    public void frenar(int k) {
        velocidad = velocidad - k;
        if (velocidad < 0) {
            velocidad = 0;
        }
        System.out.println("Frenando");
        System.out.println(toString());
        cambiarMarcha(velocidad);
    }

    @Override
    public String toString() {
        return "El vehiculo con matrícula " + this.getMatricula() + " va a " + velocidad + "km/h. La marcha es: " + marcha + ". Tiene " + this.getPuertas() + " puertas. Es un coche manual.\n";
    }
}
