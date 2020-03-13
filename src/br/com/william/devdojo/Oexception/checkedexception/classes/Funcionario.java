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
public class Funcionario extends Pessoa{

    @Override
    public void salvar()  {
        System.out.println("Sem excessao");
    }
    
}
