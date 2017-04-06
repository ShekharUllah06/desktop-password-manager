/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordmanager;

import java.io.File;

/**
 *
 * @author Abdullah Shekhar
 */
public class Global {

    public static final String USER_FILE = "D://UserInfo.ser";
    public static final String ACCOUNT_FILE_PATH = System.getProperty("user.home")
            + File.separator + "PasswordManager"
            + File.separator + "Data";
    public static final String ACCOUNT_FILE = ACCOUNT_FILE_PATH
            + File.separator + "AccountInfo.ser";

    public static final String USER_PREF = "com.dev-station.passwordmanager.user.preference";
}
