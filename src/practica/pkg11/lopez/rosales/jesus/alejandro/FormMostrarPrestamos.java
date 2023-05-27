/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg11.lopez.rosales.jesus.alejandro;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormMostrarPrestamos extends javax.swing.JFrame {

    FormMenu principal;
    Pila listaPrestamos;
    ImagenFondo fondo;

    public FormMostrarPrestamos(FormMenu menu, Pila lista) {
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
        listaPrestamos = lista;
        String rutaRegresar = "src/imagenes/deshacer.png";
        ImageIcon imgRegresar = new ImageIcon(rutaRegresar);
        Cursor cursorRegresar = Toolkit.getDefaultToolkit().createCustomCursor(imgRegresar.getImage(), new Point(1, 1), null);
        btnRegresar.setCursor(cursorRegresar);

        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabecera = {"Alumno", "Libro", "Fecha Préstamo", "Fecha Devolución"};
        modelo.setColumnIdentifiers(cabecera);

        Object[] elementosPila = listaPrestamos.imprimirPila();
        for (Object elemento : elementosPila) {
            Prestamo prestamo = (Prestamo) elemento;
            Object[] datos = {prestamo.getAlumno(), prestamo.getLibro(), prestamo.getFechaPrestamo(), prestamo.getFechaDevolucion()};
            modelo.addRow(datos);
            tbInfo.setModel(modelo);
        }
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

        lbTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInfo = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("INFORMACIÓN DE PRESTAMOS:");
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 375, -1));

        tbInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 375, 190));

        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 420, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void tbInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInfoMouseClicked
        // TODO add your handling code here:
        int numRenglon = tbInfo.getSelectedRow();
        int numColmuna = tbInfo.getSelectedColumn();
        String valor = tbInfo.getValueAt(numRenglon, numColmuna).toString();
        JOptionPane.showMessageDialog(null, "Valor: " + valor + "\n" + "Renglón/Columna: " + numRenglon + ", " + numColmuna);
    }//GEN-LAST:event_tbInfoMouseClicked

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
            java.util.logging.Logger.getLogger(FormMostrarPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbInfo;
    // End of variables declaration//GEN-END:variables
}
