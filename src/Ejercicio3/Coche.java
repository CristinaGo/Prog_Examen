package Ejercicio3;

/**
 * @author Cristina Gómez campos
 */

public abstract class Coche extends Vehiculo {
    private int puertas;

    public Coche(String matricula) {
        super(matricula);
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "El vehiculo con matrícula " + this.getMatricula() + " va a " + velocidad + "km/h. Tiene " + puertas + " puertas";
    }
}
