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

import java.awt.Image;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import passwordmanager.bean.Manager;
import passwordmanager.util.PasswordGenerator;

/**
 *
 * @author Abdullah Shekhar
 */
public class AccountInfo extends javax.swing.JFrame {

    /**
     * Creates new form AccountInfo
     */
    public AccountInfo() {
        initComponents();
        setButtonIcon();
        clear();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAccountInfo = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblUrl = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        txtUrl = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnGeneratePassword = new javax.swing.JButton();
        chkNumeric = new javax.swing.JCheckBox();
        chkLowerCase = new javax.swing.JCheckBox();
        chkUpperCase = new javax.swing.JCheckBox();
        chkSpecialChar = new javax.swing.JCheckBox();
        lblLength = new javax.swing.JLabel();
        spnrLength = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccountInfo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAccountInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Account Info"));

        lblUserName.setText("User Name:");

        jLabel2.setText("Password:");

        lblType.setText("Type:");

        lblUrl.setText("URL:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnGeneratePassword.setText("Generate Password");
        btnGeneratePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratePasswordActionPerformed(evt);
            }
        });

        chkNumeric.setSelected(true);
        chkNumeric.setText("0-9");

        chkLowerCase.setSelected(true);
        chkLowerCase.setText("a-z");

        chkUpperCase.setSelected(true);
        chkUpperCase.setText("A-Z");

        chkSpecialChar.setText("Special Char");

        lblLength.setText("Length:");

        spnrLength.setModel(new javax.swing.SpinnerNumberModel(6, 6, 25, 1));

        javax.swing.GroupLayout pnlAccountInfoLayout = new javax.swing.GroupLayout(pnlAccountInfo);
        pnlAccountInfo.setLayout(pnlAccountInfoLayout);
        pnlAccountInfoLayout.setHorizontalGroup(
            pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAccountInfoLayout.createSequentialGroup()
                        .addComponent(lblUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAccountInfoLayout.createSequentialGroup()
                        .addGroup(pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblType)
                            .addComponent(lblUrl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUrl)
                            .addGroup(pnlAccountInfoLayout.createSequentialGroup()
                                .addGroup(pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAccountInfoLayout.createSequentialGroup()
                                        .addComponent(btnSave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnClear))
                                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlAccountInfoLayout.createSequentialGroup()
                                        .addComponent(chkNumeric)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkLowerCase)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkUpperCase)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chkSpecialChar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblLength)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnrLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGeneratePassword)))
                                .addGap(0, 33, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlAccountInfoLayout.setVerticalGroup(
            pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNumeric)
                    .addComponent(chkLowerCase)
                    .addComponent(chkUpperCase)
                    .addComponent(chkSpecialChar)
                    .addComponent(lblLength)
                    .addComponent(spnrLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeneratePassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUrl)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccountInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Records"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        tblAccountInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "User Name", "Password", "Type", "URL"
            }
        ));
        tblAccountInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccountInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAccountInfo);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAccountInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAccountInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtUserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter user name!");
            txtUserName.grabFocus();
        } else if (txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter password or generate new one!");
            txtPassword.grabFocus();
        } else {
            passwordmanager.bean.AccountInfo accountInfo = new passwordmanager.bean.AccountInfo();
            //accountInfo.setId(1);
            accountInfo.setUserName(txtUserName.getText());
            accountInfo.setPassword(txtPassword.getText());
            accountInfo.setType(txtType.getText());
            accountInfo.setWebsite(txtUrl.getText());
            Manager manager = new Manager();
            if (manager.persist(accountInfo)) {
                clear();
                populateTable();
            } else {
                JOptionPane.showMessageDialog(this, "Something went wrong!");
            }

        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblAccountInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountInfoMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblAccountInfo.getModel();
        txtUserName.setText(model.getValueAt(tblAccountInfo.getSelectedRow(), 1).toString());
        txtPassword.setText(model.getValueAt(tblAccountInfo.getSelectedRow(), 2).toString());
        try{
           txtType.setText(model.getValueAt(tblAccountInfo.getSelectedRow(), 3).toString()); 
        }catch(NullPointerException npe){
            
        }
        try{
            txtUrl.setText(model.getValueAt(tblAccountInfo.getSelectedRow(), 4).toString());
        }catch(NullPointerException npe){
            
        }
        
        updateId=Integer.parseInt(model.getValueAt(tblAccountInfo.getSelectedRow(), 0).toString());
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tblAccountInfoMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         //passwordmanager.bean.AccountInfo accountInfo =  em.find( passwordmanager.bean.AccountInfo.class, 4);
         //System.out.println(accountInfo.toString());
         Manager m=new Manager();
         passwordmanager.bean.AccountInfo accountInfo = new passwordmanager.bean.AccountInfo();
         accountInfo.setId(updateId);
         accountInfo.setPassword(txtPassword.getText());
         accountInfo.setUserName(txtUserName.getText());
         accountInfo.setWebsite(txtUrl.getText());
         accountInfo.setType(txtType.getText());
         m.updateEntity(accountInfo);
         clear();
         populateTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         Manager m=new Manager();
         passwordmanager.bean.AccountInfo accountInfo = new passwordmanager.bean.AccountInfo();
         accountInfo.setId(updateId);
         //accountInfo.setPassword(txtPassword.getText());
         //accountInfo.setUserName(txtUserName.getText());
         //accountInfo.setWebsite(txtUrl.getText());
         //accountInfo.setType(txtType.getText());
         m.deleteEntity(accountInfo);
         clear();
         populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnGeneratePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratePasswordActionPerformed
        if(!chkLowerCase.isSelected() && !chkUpperCase.isSelected() && !chkNumeric.isSelected() && !chkSpecialChar.isSelected()){
            JOptionPane.showMessageDialog(this, "Please select atleast one checkbox to generate passwored!");
        }else{
            txtPassword.setText(PasswordGenerator.genetratePassword(chkUpperCase.isSelected(),chkLowerCase.isSelected(),chkNumeric.isSelected(),chkSpecialChar.isSelected(),(int)spnrLength.getValue()));
        }    
    }//GEN-LAST:event_btnGeneratePasswordActionPerformed

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
            java.util.logging.Logger.getLogger(AccountInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountInfo().setVisible(true);
            }
        });
    }

    private void setButtonIcon() {
        ImageIcon imageIcon = new ImageIcon("res/save.jpg");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        btnSave.setIcon(imageIcon);

        imageIcon = new ImageIcon("res/update.jpg");
        image = imageIcon.getImage();
        newimg = image.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        btnUpdate.setIcon(imageIcon);

        imageIcon = new ImageIcon("res/delete.png");
        image = imageIcon.getImage();
        newimg = image.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        btnDelete.setIcon(imageIcon);

        imageIcon = new ImageIcon("res/clear.jpg");
        image = imageIcon.getImage();
        newimg = image.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        btnClear.setIcon(imageIcon);

    }

    private void clear() {
        txtUserName.setText("");
        txtPassword.setText("");
        txtType.setText("");
        txtUrl.setText("");
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        tblAccountInfo.clearSelection();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblAccountInfo.getModel();
        model.setNumRows(0);
        Manager m = new Manager();
        Collection<passwordmanager.bean.AccountInfo> emps = m.findAllAccountInfo();
        for (passwordmanager.bean.AccountInfo e : emps) {
            model.addRow(new Object[]{e.getId(),e.getUserName(), e.getPassword(), e.getType(), e.getWebsite()});
        }

    }
    private static int updateId=0;
    private EntityManager em;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGeneratePassword;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkLowerCase;
    private javax.swing.JCheckBox chkNumeric;
    private javax.swing.JCheckBox chkSpecialChar;
    private javax.swing.JCheckBox chkUpperCase;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblUrl;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlAccountInfo;
    private javax.swing.JSpinner spnrLength;
    private javax.swing.JTable tblAccountInfo;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtUrl;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
