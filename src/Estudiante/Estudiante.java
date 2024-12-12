
package Estudiante;

import Persona.Persona;

public class Estudiante extends Persona {
    private String carrera;

    // Constructor
    public Estudiante(String nombreCompleto, int edad, String carrera) {
        super(nombreCompleto, edad); // Llamada al constructor de la clase base (Persona)
        this.carrera = carrera;
    }

    // Getter y Setter para carrera
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Representación en texto
    @Override
    public String toString() {
        return "Estudiante{" +
               "nombreCompleto='" + getNombreCompleto() + '\'' +
               ", edad=" + getEdad() +
               ", carrera='" + carrera + '\'' +
               '}';
    }
}

