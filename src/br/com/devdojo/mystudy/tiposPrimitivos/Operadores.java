package br.com.devdojo.mystudy.tiposPrimitivos;

import java.io.PrintStream;

public class Operadores{
	public static void main(String args[]){
		PrintStream saida=System.out;
		//Operadores
		int number1=10;
		int number2=20;
	
		saida.println("a + b ="+(number1+number2));
		saida.println("a - b ="+(number1-number2));
		saida.println("a * b ="+(number1*number2));
		saida.println("a / b ="+(double)(number1/(number2*1.0)));
	}
}
