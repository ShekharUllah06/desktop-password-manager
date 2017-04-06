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
package passwordmanager.service;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import passwordmanager.Global;
import passwordmanager.bean.Account;
import passwordmanager.bean.User;

/**
 *
 * @author Abdullah Shekhar
 */
public class AccountService {

    public static boolean insertAccount(ArrayList<Account> accounts) {
        try {
            
            // write object to file
            FileOutputStream fos = new FileOutputStream(Global.ACCOUNT_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(accounts);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static ArrayList<Account> readAccounts() {
        ArrayList<Account> accountList = null;
        try {
            // read object from file
            FileInputStream fis = new FileInputStream(Global.ACCOUNT_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);
            accountList = new ArrayList<>();
            accountList = (ArrayList<Account>) ois.readObject();
            ois.close();
            //System.out.println("User Name: " + user.getUserName()+ ", Password: " + user.getPassword());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //return null;
        } catch (EOFException e) {
            e.printStackTrace();
            //return null;
        } catch (ClassNotFoundException e) {
          e.printStackTrace();
            //return null;
        } catch (IOException eof) {
           eof.printStackTrace();
            //return null;
        }
        return accountList;
    }
}
