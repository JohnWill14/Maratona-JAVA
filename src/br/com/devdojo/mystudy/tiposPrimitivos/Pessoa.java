package br.com.devdojo.mystudy.tiposPrimitivos;
import java.io.PrintStream;

public class Pessoa{
	public static void main(String arg[]){
		PrintStream saida=System.out;		
		
		String nome="John William ";
		int idade=19;
		char sexo='M';
		String estadoCivil="Solteiro";
		double salario=0;
		
		saida.println("Sr(a) "+nome+" do sexo "+sexo+"; idade "+idade+" anos; estado civil "+estadoCivil+" e salario R$ "+salario+" encontra-se empregado nesse estabelecimento");
	}


}
