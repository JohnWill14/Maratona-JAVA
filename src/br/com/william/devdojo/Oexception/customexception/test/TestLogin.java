/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Oexception.customexception.test;

import br.com.william.devdojo.Oexception.customexception.classe.LoginInvalidoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class TestLogin {
    public static void main(String[] args) {
        try {
            logar(new String[]{
                "joh william",
                "123"
            },new String[]{
                "john william",
                "123"
            });
        } catch (LoginInvalidoException ex) {
            ex.printStackTrace();
        }
    }
    public static void logar(String[] user,String[] banco) throws LoginInvalidoException{
        if(user[0].equals(banco[0])&&user[1].equals(banco[1])){
            System.out.println("OK");
        }else throw new LoginInvalidoException();
    }
}
