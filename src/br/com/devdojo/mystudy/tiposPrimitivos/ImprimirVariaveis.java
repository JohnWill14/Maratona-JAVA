package br.com.devdojo.mystudy.tiposPrimitivos;
import java.io.PrintStream;
public class ImprimirVariaveis{
	//Comentario de uma linha
	/*
		Comentario de mais de uma linha
		Comentario maior
	*/
	/***
	* Comentario de documetação para javadoc
	* @param args parametro de entrada do metodo main
	*/
	public static void main(String devdojo[]){
		//Metodo main é procurado pela jvm para ser executado
		PrintStream saida=System.out;
		/*
		Tipos primitivos:
			 int
			 double
			 float
			 boolean
			 char
			 long 
			 bit
			 short
		*/
		int idadeEmAnos=19;
		//variaveis primeira letra minuscula e as outras palavras essa em maiuscula CamiCase
		saida.println("Dados Impressos:\n"+"idade: "+idadeEmAnos+"\n");
	}

}
















