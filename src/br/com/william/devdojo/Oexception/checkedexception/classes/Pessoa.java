/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Oexception.checkedexception.classes;

import java.io.FileNotFoundException;
import javax.security.auth.login.LoginException;

/**
 *
 * @author usuario
 */
public class Pessoa {
    public void salvar() throws LoginException,FileNotFoundException{
        System.out.println("Com excessao");
    }
}
