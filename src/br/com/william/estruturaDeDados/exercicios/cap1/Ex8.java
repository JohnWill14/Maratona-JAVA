/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.estruturaDeDados.exercicios.cap1;

/**
 *
 * @author usuario
 */
public class Ex8 {
    private long numberOne;
    private long numberTwo;

    public Ex8() {
    }

    public long getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(long numberOne) {
        this.numberOne = numberOne;
    }

    public long getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(long numberTwo) {
        this.numberTwo = numberTwo;
    }
    public boolean isMultiplo(){
        return this.numberTwo%numberOne==0;
    }
    public static void main(String[] args) {
        Ex8 exercicio8=new Ex8();
        exercicio8.numberOne=999999L;
        exercicio8.numberTwo=999998L;
        System.out.println(exercicio8.isMultiplo()?"he multiplo":"nao he multiplo");
    }
}
