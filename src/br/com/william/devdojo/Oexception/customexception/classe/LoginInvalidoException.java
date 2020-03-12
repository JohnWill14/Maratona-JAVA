/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Oexception.customexception.classe;

/**
 *
 * @author usuario
 */
public class LoginInvalidoException extends Exception{

    public LoginInvalidoException() {
        super("Usuario ou senha invalida !!!");
    }
    public LoginInvalidoException(String ex){
        super(ex);
    }
    
    public LoginInvalidoException(Exception ex){
        super(ex);
    }
}
