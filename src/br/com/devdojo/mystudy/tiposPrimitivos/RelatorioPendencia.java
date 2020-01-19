package br.com.devdojo.mystudy.tiposPrimitivos;
import java.io.PrintStream;
public class RelatorioPendencia{
	public static void main(String args[]){
		PrintStream saida=System.out;
		//Variaveis local devem sempre ser inicializada
		String nome="John William Vicente";
		String endereco="Juruaia - AC";
		String telefone="(87) 9034-1221";
		
		saida.println("O "+nome+" domiciliado no endereco "+endereco+" nao possui nenhum tipo de pendencia.");
	}

}
