package br.com.william.estruturadedados.array;

public class Array{
	public static void main(String[] args) {
		//Iniciação de variaveis
		//byte,short, int, long, float, double =0
		//char = '\u0000' => ''
		//boolean = false
		// referencia = null
		//O Java buga se não inicializar! VIVA a JVM!!!!YUPY!!!!
		int[] idade;
		idade=new int[3];// o new inicializa o espaço de memoria do objeto
		System.out.println("0 =>"+idade[0]+"\n1 =>"+idade[1]+"\n2 =>"+idade[2]);

		idade[0]=13;
		idade[1]=18;
		idade[2]=19;

	}
}