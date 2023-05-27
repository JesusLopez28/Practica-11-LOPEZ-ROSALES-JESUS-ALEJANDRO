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

public class FormRegistrarPrestamos extends javax.swing.JFrame {

    FormMenu principal;
    Pila listaPrestamos;
    Pila listaAlumnos;
    Pila listaLibros;
    ImagenFondo fondo;

    public FormRegistrarPrestamos(FormMenu menu, Pila listaP, Pila listaA, Pila listaL) {
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
        listaPrestamos = listaP;
        listaAlumnos = listaA;
        listaLibros = listaL;
        this.llenarCombos();
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

        btnLimpiar = new javax.swing.JButton();
        comboAlumno = new javax.swing.JComboBox();
        btnPop = new javax.swing.JButton();
        lbPrestamo = new javax.swing.JLabel();
        btnPush = new javax.swing.JButton();
        lbDevolucion = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        txtDevolucion = new javax.swing.JTextField();
        txtPrestamo = new javax.swing.JTextField();
        lbAlumno = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbLibro = new javax.swing.JLabel();
        comboLibro = new javax.swing.JComboBox();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 230, 90, -1));

        comboAlumno.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        getContentPane().add(comboAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 54, 250, -1));

        btnPop.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 230, -1, -1));

        lbPrestamo.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbPrestamo.setText("Fecha Prestamo:");
        getContentPane().add(lbPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, -1, -1));

        btnPush.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        lbDevolucion.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbDevolucion.setText("Fecha Devolución:");
        getContentPane().add(lbDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 189, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 230, 100, -1));

        txtDevolucion.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtDevolucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDevolucionKeyTyped(evt);
            }
        });
        getContentPane().add(txtDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 186, 250, -1));

        txtPrestamo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        getContentPane().add(txtPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 142, 250, -1));

        lbAlumno.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbAlumno.setText("Alumno:");
        getContentPane().add(lbAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, -1, -1));

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("REGISTRO DE PRESTAMOS:");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 319, -1));

        lbLibro.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbLibro.setText("Libro:");
        getContentPane().add(lbLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, 53, -1));

        comboLibro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        getContentPane().add(comboLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 98, 250, -1));
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.actionLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        // TODO add your handling code here:
        if (listaPrestamos.estaVacia()) {
            JOptionPane.showMessageDialog(null, "La pila de prestamos está vacía.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            listaPrestamos.pop();
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

    private void txtDevolucionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDevolucionKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (caracter == KeyEvent.VK_ENTER) {
            this.actionPush();
            this.actionLimpiar();
        }
    }//GEN-LAST:event_txtDevolucionKeyTyped

    private void actionPush() {
        String alumno, libro, fechaPrestamo, fechaDevolucion;
        alumno = (String) comboAlumno.getSelectedItem();
        libro = (String) comboLibro.getSelectedItem();
        fechaPrestamo = txtPrestamo.getText();
        fechaDevolucion = txtDevolucion.getText();

        if (!alumno.isEmpty() && !libro.isEmpty() && !fechaPrestamo.isEmpty() && !fechaDevolucion.isEmpty()) {
            listaPrestamos.push(new Prestamo(alumno, libro, fechaPrestamo, fechaDevolucion));
            JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actionLimpiar() {
        comboAlumno.setSelectedIndex(0);
        comboLibro.setSelectedIndex(0);
        txtPrestamo.setText("");
        txtDevolucion.setText("");
        comboAlumno.requestFocus();
    }

    private void llenarCombos() {
        Object[] auxA = listaAlumnos.imprimirPila();
        Object[] auxL = listaLibros.imprimirPila();

        for (Object alumno : auxA) {
            Alumno a = (Alumno) alumno;
            comboAlumno.addItem(a.getNombre() + " " + a.getApellido());
        }

        for (Object libro : auxL) {
            Libro l = (Libro) libro;
            comboLibro.addItem(l.getTitulo());
        }
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
            java.util.logging.Logger.getLogger(FormRegistrarPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox comboAlumno;
    private javax.swing.JComboBox comboLibro;
    private javax.swing.JLabel lbAlumno;
    private javax.swing.JLabel lbDevolucion;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbLibro;
    private javax.swing.JLabel lbPrestamo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtDevolucion;
    private javax.swing.JTextField txtPrestamo;
    // End of variables declaration//GEN-END:variables
}
