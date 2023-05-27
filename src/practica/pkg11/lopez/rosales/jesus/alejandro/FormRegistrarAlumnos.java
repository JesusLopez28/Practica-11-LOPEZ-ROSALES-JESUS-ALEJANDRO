/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg11.lopez.rosales.jesus.alejandro;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FormRegistrarAlumnos extends javax.swing.JFrame {

    FormMenu principal;
    Pila listaAlumnos;
    ImagenFondo fondo;

    public FormRegistrarAlumnos(FormMenu menu, Pila lista) {
        fondo = new ImagenFondo("src/imagenes/fondo.jpg");
        this.setContentPane(fondo);
        this.setSize(450, 400);
        initComponents();
        ImageIcon imageIcon = new ImageIcon("src/imagenes/fondo.png");
        Image imagen = imageIcon.getImage();
        Image imagenEscalada = imagen.getScaledInstance(350, 300, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(imagenEscalada);
        lbFondo.setIcon(imageIcon);
        principal = menu;
        listaAlumnos = lista;

        String rutaPush = "src/imagenes/agregar.png";
        String rutaPop = "src/imagenes/borrar.png";
        String rutaLimpiar = "src/imagenes/limpiar.png";
        String rutaRegresar = "src/imagenes/deshacer.png";

        ImageIcon imgPush = new ImageIcon(rutaPush);
        ImageIcon imgPop = new ImageIcon(rutaPop);
        ImageIcon imgLimpiar = new ImageIcon(rutaLimpiar);
        ImageIcon imgRegresar = new ImageIcon(rutaRegresar);

        Cursor cursoPush = Toolkit.getDefaultToolkit().createCustomCursor(imgPush.getImage(), new Point(1, 1), null);
        Cursor cursorPop = Toolkit.getDefaultToolkit().createCustomCursor(imgPop.getImage(), new Point(1, 1), null);
        Cursor cursorLimpiar = Toolkit.getDefaultToolkit().createCustomCursor(imgLimpiar.getImage(), new Point(1, 1), null);
        Cursor cursorRegresar = Toolkit.getDefaultToolkit().createCustomCursor(imgRegresar.getImage(), new Point(1, 1), null);

        btnPush.setCursor(cursoPush);
        btnPop.setCursor(cursorPop);
        btnLimpiar.setCursor(cursorLimpiar);
        btnRegresar.setCursor(cursorRegresar);
    }

    @Override
    public Image getIconImage() {
        Image valorRetornado = Toolkit.getDefaultToolkit().getImage(
                ClassLoader.getSystemResource("imagenes/libros.png"));
        return valorRetornado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPop = new javax.swing.JButton();
        btnPush = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        comboCarrera = new javax.swing.JComboBox();
        lbCarrera = new javax.swing.JLabel();
        lbRegistro = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPop.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 233, -1, -1));

        btnPush.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 233, 100, -1));

        txtNombre.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 57, 260, -1));

        lbNombre.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbNombre.setText("Nombre:");
        getContentPane().add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("REGISTRO DE USUARIOS:");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 330, -1));

        lbApellido.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbApellido.setText("Apellido:");
        getContentPane().add(lbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, 70, -1));

        comboCarrera.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        comboCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Calidad Total y Productividad", "Construcción", "Control Automático e Instrumentación", "Diseño y Mecánica Industrial", "Desarrollo Electrónico", "Desarrollo de Software", "Electromecánica", "Electrónica y Comunicaciones", "Sistemas Electrónicos y Telecomunicaciones", "Mecánica Automotriz", "Máquinas Herramientas", "Químico en Alimentos", "Químico Industrial", "Químico en Fármacos" }));
        getContentPane().add(comboCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 145, 260, -1));

        lbCarrera.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbCarrera.setText("Carrera:");
        getContentPane().add(lbCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, 70, -1));

        lbRegistro.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbRegistro.setText("Registro:");
        getContentPane().add(lbRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 192, -1, -1));

        txtRegistro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroKeyTyped(evt);
            }
        });
        getContentPane().add(txtRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 189, 260, -1));

        txtApellido.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 101, 260, -1));

        btnLimpiar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 233, -1, -1));
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        // TODO add your handling code here:
        if (listaAlumnos.estaVacia()) {
            JOptionPane.showMessageDialog(null, "La pila de alumnos está vacía.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            listaAlumnos.pop();
            JOptionPane.showMessageDialog(null, "Los datos se han recorrido.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        // TODO add your handling code here:
        this.actionPush();
        this.actionLimpiar();
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FormMenu.txtUsuario.setText(principal.usuario.toUpperCase());
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.actionLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtRegistroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (caracter == KeyEvent.VK_ENTER) {
            this.actionPush();
            this.actionLimpiar();
        }
    }//GEN-LAST:event_txtRegistroKeyTyped

    private void actionPush() {
        String nombre, apellido, carrera;
        String registroStr;
        int registro;
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        registroStr = txtRegistro.getText();
        carrera = "";
        if (!registroStr.isEmpty() && registroStr.length() == 8) {
            registro = Integer.parseInt(registroStr);
        } else {
            JOptionPane.showMessageDialog(null, "El número de registro debe tener 8 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (comboCarrera.getSelectedItem() != null) {
            carrera = (String) comboCarrera.getSelectedItem();
        }
        if (!nombre.isEmpty() && !apellido.isEmpty() && !carrera.isEmpty()) {
            listaAlumnos.push(new Alumno(nombre, apellido, registro, carrera));
            JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actionLimpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtRegistro.setText("");
        comboCarrera.setSelectedIndex(0);
        txtNombre.requestFocus();
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistrarAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox comboCarrera;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCarrera;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRegistro;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRegistro;
    // End of variables declaration//GEN-END:variables
}
