/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.william.devdojo.Qwrapers.test;

/**
 *
 * @author usuario
 */
public class WrapersTest {
    public static void main(String[] args) {
        byte bytePrimitivo=8;
        short shortPrimitivo=16;
        int intPrimitivo=32;
        long longPrimitivo=64l;
        float floatPrimitivo=32f;
        double doublePrimitivo=64d;
        boolean booleanPrimitivo=false;
        char charPrimitivo='j';
        
        //Classe wraper imitam tipos primitivos mas são objetos
        Byte biteObject=8;//1-127 2^7-1
        Short shortObject=16;//-32.768 a 32.767 2^8-1
        Integer intObject=32;//-2^31 a 2^31 – 1 
        Long longObject=64l;//-2^63 a 2^63 -1
        Float floatObject=32f;//IEEE 754 ±1,40129846432481707e-45 a 3,40282346638528860e+38
        Double doubleObject=64d;//IEEE 754 ±4,94065645841246544e-324 a 1,79769313486231570e+308
        Boolean booleanObject=false;
        Character charObject='j';
        
        Integer intWraper=14;//AutoBox faz conversao do primitivo e tranforma em object
        int idade=intWraper;//UnBox faz o contrario do AutoBox java he top
        
        Integer inteiro=new Integer("10");
        System.out.println(new Boolean("TrUE"));
        float f=Float.parseFloat("10");
        Long l=Long.valueOf("2022020");
        
    }
}
