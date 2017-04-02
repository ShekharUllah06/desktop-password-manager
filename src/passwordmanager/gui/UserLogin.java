/*
 * Copyright (C) 2017 Abdullah Shekhar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package passwordmanager.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import passwordmanager.bean.User;
import passwordmanager.service.UserService;
import passwordmanager.util.PasswordDigest;

/**
 *
 * @author Abdullah Shekhar
 */
public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    public UserLogin() {
        initComponents();
        setImagePanel();
        this.setResizable(false);
        JRootPane rootPane = SwingUtilities.getRootPane(btnLogin);
        rootPane.setDefaultButton(btnLogin);
        setButtonIcon();
        this.setTitle("User Login");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(UserLogin.class.getResource("/resources/login.png")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnpUserInfo = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        pnlImage = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnpUserInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Login Info"));

        lblUserName.setText("User Name:");

        jLabel1.setText("Password:");

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnpUserInfoLayout = new javax.swing.GroupLayout(pnpUserInfo);
        pnpUserInfo.setLayout(pnpUserInfoLayout);
        pnpUserInfoLayout.setHorizontalGroup(
            pnpUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnpUserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnpUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnpUserInfoLayout.createSequentialGroup()
                        .addComponent(lblUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnpUserInfoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnpUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnpUserInfoLayout.createSequentialGroup()
                                .addComponent(btnLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPassword)))))
        );
        pnpUserInfoLayout.setVerticalGroup(
            pnpUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnpUserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnpUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnpUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnpUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnpUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(pnpUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtPassword.setText("");
        txtUserName.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
 
    }//GEN-LAST:event_txtPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserLogin userLogin = new UserLogin();
                userLogin.setLocationRelativeTo(null);
                userLogin.setVisible(true);

            }
        });
    }
    
    private void login(){
        if (txtUserName.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please Enter User Name!");
            txtUserName.grabFocus();
        } else if (txtPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Please Enter Password!");
            txtPassword.grabFocus();
        } else {
            User user = UserService.readUser();
            String password = null;
            try {
                password = PasswordDigest.digest(txtPassword.getText());
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            if (txtUserName.getText().equals(user.getUserName()) && password.equals(user.getPassword())) {
                dispose();
                Main myFrame = new Main();
                myFrame.setVisible(true);
                myFrame.setExtendedState(myFrame.getExtendedState() | myFrame.MAXIMIZED_BOTH);

            } else {
                JOptionPane.showMessageDialog(this, "User name and password mismatch!");
            }
        }
    }

    private void setImagePanel() {
        ImageIcon imageIcon = new ImageIcon("res/l.png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        JLabel label = new JLabel("", imageIcon, JLabel.CENTER);
        //label.
        label.setBackground(Color.RED);
        //JPanel panel = new JPanel(new BorderLayout());
        pnlImage.setLayout(new BorderLayout());
        pnlImage.add(label, BorderLayout.CENTER);
    }
    
     private void setButtonIcon() {
        ImageIcon imageIcon = new ImageIcon("res/login.png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        btnLogin.setIcon(imageIcon);


        imageIcon = new ImageIcon("res/clear.jpg");
        image = imageIcon.getImage();
        newimg = image.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        btnClear.setIcon(imageIcon);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JPanel pnpUserInfo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
