/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg11.lopez.rosales.jesus.alejandro;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.ImageIcon;

public class FormRegistrarLibros extends javax.swing.JFrame {

    FormMenu principal;
    Pila listaLibros;
    ImagenFondo fondo;

    public FormRegistrarLibros(FormMenu menu, Pila lista) {
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
        listaLibros = lista;
        scrollAño.setMinimum(1000);
        scrollAño.setMaximum(2023);
        DefaultBoundedRangeModel modelo = new DefaultBoundedRangeModel();
        modelo.setMinimum(1000);
        modelo.setMaximum(2023);
        modelo.setValue(2023);
        scrollAño.setModel(modelo);
        lbAño.setText("Año: 2023");
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
        btnPop = new javax.swing.JButton();
        lbAño = new javax.swing.JLabel();
        btnPush = new javax.swing.JButton();
        lbEditorial = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        txtEditorial = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        lbTituloLibro = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbAutor = new javax.swing.JLabel();
        scrollAño = new javax.swing.JScrollBar();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 227, -1, -1));

        btnPop.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 227, -1, -1));

        lbAño.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbAño.setText("Año:");
        getContentPane().add(lbAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 39, -1));

        btnPush.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 227, -1, -1));

        lbEditorial.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbEditorial.setText("Editorial:");
        getContentPane().add(lbEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, 53, -1));

        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 227, -1, -1));

        txtEditorial.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditorialKeyTyped(evt);
            }
        });
        getContentPane().add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 183, 280, -1));

        txtAutor.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 101, 280, -1));

        txtTitulo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 57, 280, -1));

        lbTituloLibro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbTituloLibro.setText("Título:");
        getContentPane().add(lbTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("REGISTRO DE LIBROS:");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 380, -1));

        lbAutor.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbAutor.setText("Autor:");
        getContentPane().add(lbAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, 39, -1));

        scrollAño.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        scrollAño.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrollAño.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrollAñoAdjustmentValueChanged(evt);
            }
        });
        getContentPane().add(scrollAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 145, 280, 20));
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.actionLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        // TODO add your handling code here:
        if (listaLibros.estaVacia()) {

        } else {
            listaLibros.pop();

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

    private void txtEditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (caracter == KeyEvent.VK_ENTER) {
            this.actionPush();
            this.actionLimpiar();
        }
    }//GEN-LAST:event_txtEditorialKeyTyped

    private void scrollAñoAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrollAñoAdjustmentValueChanged
        // TODO add your handling code here:
        lbAño.setText("Año: " + String.valueOf(scrollAño.getValue()));
    }//GEN-LAST:event_scrollAñoAdjustmentValueChanged

    private void actionPush() {
        String titulo, autor, editorial;
        int año;
        titulo = txtTitulo.getText();
        autor = txtAutor.getText();
        año = scrollAño.getValue();
        editorial = txtEditorial.getText();

        if (!titulo.isEmpty() && !autor.isEmpty() && año != 0 && !editorial.isEmpty()) {
            listaLibros.push(new Libro(titulo, autor, año, editorial));
        } else {

        }
    }

    private void actionLimpiar() {
        txtTitulo.setText("");
        txtAutor.setText("");
        txtEditorial.setText("");
        scrollAño.setValue(0);
        txtTitulo.requestFocus();
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
            java.util.logging.Logger.getLogger(FormRegistrarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbAño;
    private javax.swing.JLabel lbEditorial;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTituloLibro;
    private javax.swing.JScrollBar scrollAño;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
