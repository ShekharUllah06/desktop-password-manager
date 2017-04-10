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
package passwordmanager.bean;

import java.io.Serializable;

/**
 *
 * @author Abdullah Shekhar
 */
public class Account implements Serializable {
    private String userName;
    private String password;
    private String type;
    private String url;
    private String secretKey;
    private String recoveryContact;
    private String securityQuestion;
    private String securityAnswer;

    /**
     * default constructor
     */
    public Account() {
    }

    public Account(String userName, String password, String type, String url, String secretKey, String recoveryContact, String securityQuestion, String securityAnswer) {
        this.userName = userName;
        this.password = password;
        this.type = type;
        this.url = url;
        this.secretKey = secretKey;
        this.recoveryContact = recoveryContact;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
    }

    

    /**
     * get userName
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *  set userName
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * get password
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *  get type
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set type
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get url
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set url
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRecoveryContact() {
        return recoveryContact;
    }

    public void setRecoveryContact(String recoveryContact) {
        this.recoveryContact = recoveryContact;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    @Override
    public String toString() {
        return "Account{" + "userName=" + userName + ", password=" + password + ", type=" + type + ", url=" + url + ", secretKey=" + secretKey + ", recoveryContact=" + recoveryContact + ", securityQuestion=" + securityQuestion + ", securityAnswer=" + securityAnswer + '}';
    }
}
