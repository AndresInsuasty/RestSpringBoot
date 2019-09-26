/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ELECTRONICA
 */
public class User {
    private String mail;
    private String pass;
    private String name;
    private List<Error> errors;

    public User(String mail, String pass) {
        this.mail = mail;
        this.pass = pass;
        errors = new ArrayList<Error>();
    }

    public User(String mail, String pass, String name) {
        this.mail = mail;
        this.pass = pass;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public void addError(Error error){
        errors.add(error);
    }
    
    public boolean errorExist(){
        boolean aux = false;
        return aux;
    }

    public List<Error> getErrors() {
        return errors;
    }
    
}
