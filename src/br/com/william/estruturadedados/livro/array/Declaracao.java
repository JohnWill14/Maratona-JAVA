package br.com.william.estruturadedados.livro.array;


public class Declaracao{
	public static void main(String[] args) {
		int[] idade;// apenas uma referencia kkkk 
		idade= new int[3];
		//[] depois do tipo da variavel
		// ou [] depois do nome da variavel não recomendavel (facilidade)
		//Array he um objeto kkkkk viva os objetos
		idade[0]=19;
		idade[1]=20;
		idade[2]=16;
		System.out.println(idade.getClass());
	}
}