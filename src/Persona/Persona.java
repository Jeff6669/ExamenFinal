
package Persona;

public class Persona {

    private String nombreCompleto;
    private int edad;

    public Persona(String nombreCompleto, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }
}




class Profesor extends Persona {
    private String curso;
    private int ano;

    public Profesor(String nombreCompleto, int edad, String curso, int ano) {
        super(nombreCompleto, edad);
        this.curso = curso;
        this.ano = ano;
    }

    // Métodos agregar, listar, eliminar (puedes implementar ArrayList para esto)
}





class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombreCompleto, int edad, String carrera) {
        super(nombreCompleto, edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    // Métodos agregar, listar, eliminar (usa ArrayList para almacenar)   
}
