/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordmanager;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import passwordmanager.bean.User;
import passwordmanager.gui.CreateUser;
import passwordmanager.gui.UserLogin;
import passwordmanager.service.UserService;

/**
 *
 * @author Abdullah Shekhar
 */
public class PasswordManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        System.out.println(Global.ACCOUNT_FILE);
        File file = new File(Global.ACCOUNT_FILE);
        if (!file.exists()) {
            new File(Global.ACCOUNT_FILE_PATH).mkdirs();
            try {
                file.createNewFile();
            } catch (Exception ex) {
                Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Preferences prefsRoot = Preferences.userRoot();
        Preferences myPrefs = prefsRoot.node(Global.USER_PREF);
        
        /*try {
            myPrefs.clear();
        } catch (BackingStoreException ex) {
            Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, ex);
        }*/
 
        if (myPrefs.get("user", "").equals("")) {
            CreateUser createUser = new CreateUser();
            createUser.setLocationRelativeTo(null);
            createUser.setVisible(true);
        } else {
            UserLogin userLogin = new UserLogin();
            userLogin.setLocationRelativeTo(null);
            userLogin.setVisible(true);
        }
        
        //old code
        
        /*
        
        File file = new File(Global.USER_FILE);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        file = new File(Global.ACCOUNT_FILE);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(PasswordManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        User user = UserService.readUser();
        if (user == null) {
            CreateUser createUser = new CreateUser();
            createUser.setLocationRelativeTo(null);
            createUser.setVisible(true);
        } else {
            UserLogin userLogin = new UserLogin();
            userLogin.setLocationRelativeTo(null);
            userLogin.setVisible(true);
        }*/

    }

}
