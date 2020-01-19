package br.com.william.estruturaDeDados.array;

public class MultArray{
	public static void main(String[] args) {
		//int[] dias[] = new int[][];  Má pratica
		int[][] dias=new int[2][2];// Boa prtaica
		//int[] cria uma referencia para um array de inteiros
		//int[] [] cria referencia para um array de array de inteiros
		//dias[0];//Acessa a referencia da memoria;
		

		//O new inicializa o int com 0 kkk
		dias[0][0]=12;
		dias[0][1]=31;

		dias[1][0]=32;
		dias[1][1]=33;


		System.out.println("Referencia:\n\t1=> "+dias[0]+
							"\n\t2=> "+dias[1]+"\n\n");
		for(int[] dia:dias){
			System.out.println("\tMemoria -> "+dia);
			for(int i:dia){
				System.out.println("\t\t=> "+i);
			}
		}

	}
}