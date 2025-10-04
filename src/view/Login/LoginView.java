
package view.Login;

import dao.UsuarioDAO;
import dto.Usuario;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Main.MainView;

/**
 *
 * @author Eduardo
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginVista
     */
    public LoginView() {
        initComponents();
         setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblLogo2 = new javax.swing.JLabel();
        lblSesion = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblContra = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TAMBOimg (2).png"))); // NOI18N
        lblLogo.setName(""); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 270, 370));

        lblLogo2.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        lblLogo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tambopque.png"))); // NOI18N
        jPanel1.add(lblLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 110, 70));

        lblSesion.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblSesion.setForeground(new java.awt.Color(175, 18, 128));
        lblSesion.setText("INICIAR SESIÓN");
        jPanel1.add(lblSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(175, 18, 128));
        lblCorreo.setText("CORREO ELECTRÓNICO");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("Ingrese su correo electrónico");
        txtCorreo.setBorder(null);
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 370, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 370, 20));

        lblContra.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblContra.setForeground(new java.awt.Color(175, 18, 128));
        lblContra.setText("CONTRASEÑA");
        jPanel1.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtContra.setForeground(new java.awt.Color(204, 204, 204));
        txtContra.setText("*********");
        txtContra.setBorder(null);
        txtContra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraFocusLost(evt);
            }
        });
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 370, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 370, 20));

        btnIngresar.setBackground(new java.awt.Color(255, 238, 0));
        btnIngresar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(175, 18, 128));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorder(null);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtContraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraFocusLost
        
    }//GEN-LAST:event_txtContraFocusLost

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if(txtCorreo.getText().equals("Ingrese su correo electrónico")){
           txtCorreo.setText("");
           txtCorreo.setForeground(Color.black);
        }
        if(String.valueOf(txtContra.getPassword()).isEmpty()){
           txtContra.setText("*********");
           txtContra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        if(String.valueOf(txtContra.getPassword()).equals("*********")){
           txtContra.setText(""); 
           txtContra.setForeground(Color.black);
        }
        if(txtCorreo.getText().isEmpty()){
           txtCorreo.setText("Ingrese su correo electrónico");
           txtCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContraMousePressed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

                String correo = txtCorreo.getText().trim();
                String contraseña = new String(txtContra.getPassword());

                if (correo.isEmpty() || contraseña.isEmpty()) {
                    JOptionPane.showMessageDialog(LoginView.this, "Por favor ingrese correo y contraseña",
                            "Error de Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
                    txtCorreo.requestFocus();
                    return;
                }

                UsuarioDAO usuarioDAO = new UsuarioDAO();
                Usuario usuario = usuarioDAO.validarUsuario(correo, contraseña);

                if (usuario != null) {
                    dispose();
                    new MainView(usuario).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(LoginView.this, "Correo electrónico o contraseña incorrectos",
                            "Error de Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_btnIngresarActionPerformed


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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel lblSesion;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
