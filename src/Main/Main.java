
package Main;

import PantallaLogin.PantallaLogin;
import Usuario.Usuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear usuarios predefinidos
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("admin", "admin1234", "Administrador"));
        usuarios.add(new Usuario("estudiante1", "password123", "Estudiante"));
        usuarios.add(new Usuario("estudiante2", "securepass", "Estudiante"));

        // Mostrar pantalla de login
        new PantallaLogin(usuarios).setVisible(true);
    }

    public static void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

