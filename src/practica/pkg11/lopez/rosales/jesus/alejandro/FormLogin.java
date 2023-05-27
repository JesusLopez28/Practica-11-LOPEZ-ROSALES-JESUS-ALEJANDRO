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

public class FormLogin extends javax.swing.JFrame {

    private final int tamaño = 20;
    private final int contador;
    ImagenFondo fondo;

    Usuario usuarios[] = new Usuario[tamaño];

    public FormLogin() {
        fondo = new ImagenFondo("src/imagenes/fondo.jpg");
        this.setContentPane(fondo);
        this.setSize(450, 400);
        initComponents();
        ImageIcon imageIcon = new ImageIcon("src/imagenes/fondo.png");
        Image imagen = imageIcon.getImage();
        Image imagenEscalada = imagen.getScaledInstance(350, 300, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(imagenEscalada);
        lbFondo.setIcon(imageIcon);
        usuarios[0] = new Usuario("jesus", "3452");
        usuarios[1] = new Usuario("ivan", "2804");
        usuarios[2] = new Usuario("calos", "2010");
        usuarios[3] = new Usuario("andrea", "2012");
        usuarios[4] = new Usuario("ana", "2002");
        usuarios[5] = new Usuario("alex", "1999");

        for (int i = 6; i < tamaño; i++) {
            usuarios[i] = new Usuario();
        }

        contador = 6;

        String rutaAbrir = "src/imagenes/abrir.png";
        String rutaCerrar = "src/imagenes/cerrar.png";

        ImageIcon imgAbrir = new ImageIcon(rutaAbrir);
        ImageIcon imgCerrar = new ImageIcon(rutaCerrar);

        Cursor cursorAbrir = Toolkit.getDefaultToolkit().createCustomCursor(imgAbrir.getImage(), new Point(1, 1), null);
        Cursor cursorCerrar = Toolkit.getDefaultToolkit().createCustomCursor(imgCerrar.getImage(), new Point(1, 1), null);

        btnCancelar.setCursor(cursorCerrar);
        btnIngresar.setCursor(cursorAbrir);

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

        lbFondo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        lbContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        lbUsuario = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        btnCancelar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lbContraseña.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbContraseña.setText("Contraseña:");

        txtContraseña.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbUsuario.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lbUsuario.setText("Usuario:");

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("LOGIN DE USUARIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbContraseña))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lbUsuario))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbTitulo))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnIngresar))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnCancelar))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lbContraseña))
            .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        this.login();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (caracter == KeyEvent.VK_ENTER) {
            this.login();
        }
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void login() {
        if (!txtUsuario.getText().isEmpty() || !txtContraseña.getText().isEmpty()) {
            boolean usuarioValidado = false;
            for (int i = 0; i < contador; i++) {
                String username = usuarios[i].getUsuario();
                String password = usuarios[i].getContraseña();
                if (username.equals(txtUsuario.getText()) && password.equals(txtContraseña.getText())) {
                    FormMenu menu = new FormMenu(username);
                    menu.setVisible(true);
                    menu.setLocationRelativeTo(null);
                    this.setVisible(false);
                    usuarioValidado = true;
                    break;
                }
            }
            if (!usuarioValidado) {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de usuario y la contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
