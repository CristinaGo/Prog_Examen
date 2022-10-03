package Ejercicio3;

/**
 * @author Cristina Gómez campos
 */

public abstract class Vehiculo implements Funcionalidad {
    private String matricula;
    int velocidad;


    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "El vehiculo con matrícula " + matricula + " va a " + velocidad + "km/h";
    }

}
