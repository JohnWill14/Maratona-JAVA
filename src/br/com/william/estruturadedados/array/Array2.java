package br.com.william.estruturadedados.array;

public class Array2{
	public static void main(String[] args) {
		//Iniciação de variaveis
		//byte,short, int, long, float, double =0
		//char = '\u0000'
		//boolean = false
		// referencia = null
		//O Java buga se não inicializar! VIVA a JVM!!!!YUPY!!!!
		String[] nome;
		nome=new String[3];// o new inicializa o espaço de memoria do objeto
		
		nome[0]="Maria";
		nome[1]= "Goku";
		nome[2]="Luffy";

		for (int i=0;i<nome.length ;i++ ) {
			System.out.println(nome[i]);
		}
	}
}