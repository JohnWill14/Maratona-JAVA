package br.com.william.estruturaDeDados.inicio;

public class Assinatura{
	public static int devolveInt(int i){return i;}
	public static double devolveInt(double i){return i;}
	public static void main(String args[]){
		//Espero que dê errado->Nao deu erro meu chapa
		System.out.println("1- "+devolveInt(1));
		System.out.println("n2- "+devolveInt(2.1));
	}

}
