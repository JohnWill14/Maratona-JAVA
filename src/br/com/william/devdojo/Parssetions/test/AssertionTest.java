/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Parssetions.test;

/**
 *
 * @author usuario
 */
public class AssertionTest {
    public static void main(String[] args) {
        calculaSalario(-2000);
    }
    // Assert tem que ser utilizado na faze de desenvolvimento
    // em um método private pois pode dar pt para quem usar no public
    // Asserts não deve ser tratadas
    private static double calculaSalario(double salario){
        assert (salario>0): "Valor errado !";// Lança um erro se a expressao boolean for falsa!      
        //Fazer um calculo
//        if(salario<=0)throw new IllegalArgumentException("Valor errado");
        return salario;
    }
}
