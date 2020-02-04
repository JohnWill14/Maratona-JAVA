/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Aclasses.test;

import br.com.william.devdojo.Aclasses.classe.Professor;

/**
 *
 * @author usuario
 */
public class TestProfessor {
    public static void main(String[] args) {
        Professor prof=new Professor();
        prof.setNome("Raimundo");
        prof.setMatricula("6666187-9");
        prof.setCpf("122.333.441-45");
        prof.setRg("97-696.055.346");
        
        prof.print();
    }
}
