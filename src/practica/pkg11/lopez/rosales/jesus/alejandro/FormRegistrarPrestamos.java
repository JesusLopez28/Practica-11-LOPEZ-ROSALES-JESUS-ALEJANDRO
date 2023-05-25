/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg11.lopez.rosales.jesus.alejandro;

import java.awt.event.KeyEvent;

public class FormRegistrarPrestamos extends javax.swing.JFrame {

    FormMenu principal;
    Pila listaPrestamos;
    Pila listaAlumnos;
    Pila listaLibros;

    public FormRegistrarPrestamos(FormMenu menu, Pila listaP, Pila listaA, Pila listaL) {
        initComponents();
        principal = menu;
        listaPrestamos = listaP;
        listaAlumnos = listaA;
        listaLibros = listaL;
        this.llenarCombos();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLimpiar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        comboAlumno.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        btnPop.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        lbPrestamo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbPrestamo.setText("Fecha Prestamo:");

        btnPush.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        lbDevolucion.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbDevolucion.setText("Fecha Devolución:");

        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtDevolucion.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtDevolucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDevolucionKeyTyped(evt);
            }
        });

        txtPrestamo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbAlumno.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbAlumno.setText("Alumno:");

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("REGISTRO DE PRESTAMOS:");

        lbLibro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbLibro.setText("Libro:");

        comboLibro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPush)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAlumno)
                                .addGap(77, 77, 77)
                                .addComponent(comboAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbDevolucion)
                                        .addComponent(lbPrestamo)
                                        .addComponent(lbLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDevolucion)
                                        .addComponent(txtPrestamo)
                                        .addComponent(comboLibro, 0, 250, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAlumno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLibro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrestamo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDevolucion)
                    .addComponent(txtDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPush)
                    .addComponent(btnPop)
                    .addComponent(btnLimpiar)
                    .addComponent(btnRegresar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.actionLimpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        // TODO add your handling code here:
        if (listaPrestamos.estaVacia()) {

        } else {
            listaPrestamos.pop();

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
        } else {

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
    private javax.swing.JLabel lbLibro;
    private javax.swing.JLabel lbPrestamo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtDevolucion;
    private javax.swing.JTextField txtPrestamo;
    // End of variables declaration//GEN-END:variables
}
