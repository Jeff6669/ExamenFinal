
package MenuAdministrador;

import Estudiante.Estudiante;
import PantallaLogin.PantallaLogin;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class MenuAdministrador extends javax.swing.JFrame {

    private ArrayList<Estudiante> estudiantes;
    private JTable tablaEstudiantes;
    private DefaultTableModel modeloTabla;

    public MenuAdministrador() {
        estudiantes = new ArrayList<>();
        setTitle("Menú Administrador - Gestión de Estudiantes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        

        // Modelo de la tabla
        modeloTabla = new DefaultTableModel(new String[]{"Nombre", "Edad", "Carrera"}, 0);
        tablaEstudiantes = new JTable(modeloTabla);
        
        
        
        

        // Botones
        JButton btnAgregar = new JButton("Agregar Estudiante");
        JButton btnEliminar = new JButton("Eliminar Estudiante");
        JButton btnVolver = new JButton("Volver al Inicio de Sesión");
        

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnVolver);
        
        
        
        
        
        

        // Scroll para la tabla
        JScrollPane scrollPane = new JScrollPane(tablaEstudiantes);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(panelBotones, BorderLayout.SOUTH);

        add(panel);
        
        
       
       
        // Acción para agregar estudiante
        btnAgregar.addActionListener(e -> {
            JTextField txtNombre = new JTextField();
            JTextField txtEdad = new JTextField();
            JComboBox<String> comboCarrera = new JComboBox<>(new String[]{"Informática", "Electrónica", "Diseño"});

            Object[] mensaje = {
                "Nombre:", txtNombre,
                "Edad:", txtEdad,
                "Carrera:", comboCarrera
            };

            int opcion = JOptionPane.showConfirmDialog(this, mensaje, "Agregar Estudiante", JOptionPane.OK_CANCEL_OPTION);
            if (opcion == JOptionPane.OK_OPTION) {
                try {
                    String nombre = txtNombre.getText().trim();
                    int edad = Integer.parseInt(txtEdad.getText().trim());
                    String carrera = (String) comboCarrera.getSelectedItem();

                    if (nombre.isEmpty() || carrera.isEmpty()) {
                        throw new IllegalArgumentException("Todos los campos deben estar completos.");
                    }

                    Estudiante estudiante = new Estudiante(nombre, edad, carrera);
                    estudiantes.add(estudiante);
                    modeloTabla.addRow(new Object[]{nombre, edad, carrera});

                    JOptionPane.showMessageDialog(this, "Estudiante agregado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "La edad debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        
        
        // Acción para eliminar estudiante
        btnEliminar.addActionListener(e -> {
            int filaSeleccionada = tablaEstudiantes.getSelectedRow();
            if (filaSeleccionada >= 0) {
                estudiantes.remove(filaSeleccionada);
                modeloTabla.removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(this, "Estudiante eliminado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un estudiante para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        
        // Acción para el botón "Volver al Login"
btnVolver.addActionListener((ActionEvent e) -> {
    // Cierra la ventana actual (MenuAdministrador)
    this.dispose();

    // Abre la ventana de login (PantallaLogin)
    PantallaLogin pantallaLogin = new PantallaLogin();
    
    pantallaLogin.setVisible(true);
    
});
        
        
        
        
        
        
    
        
        
    }    

    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuAdministrador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
