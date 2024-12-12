
package Usuario;


import java.util.ArrayList;

public class Usuario {
    private String usu;
    private String pass;
    private String rol; 

// "Administrador" o "Estudiante"

    public Usuario(String usu, String pass, String rol) {
        this.usu = usu;
        this.pass = pass;
        this.rol = rol;
    }

    // Getters
    public String getUsu() {
        return usu;
    }

    public String getPass() {
        return pass;
    }

    public String getRol() {
        return rol;
    }

    // Método para validar login
    public static Usuario validarLogin(String nombreUsuario, String contrasena, ArrayList<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            if (u.getUsu().equals(nombreUsuario) && u.getPass().equals(contrasena)) {
                return u;
            }
        }
        return null;
    }
   
}
