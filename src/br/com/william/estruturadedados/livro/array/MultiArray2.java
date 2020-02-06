package br.com.william.estruturadedados.livro.array;

public class MultiArray2{
	public static void main(String[] args) {
		int[][] dias=new int[3][];

		dias[0]=new int[3];
		dias[1]=new int[]{1,2,3};
		dias[2]=new int[]{14,35,33};
		int[][] test={{1,2,3},{5,6,7,8},{999,99,9}};//Só finciona na declaracao
		for(int[] ref:test){
			for(int i:ref){
				System.out.println(i);
			}
			System.out.println("-=-=-=-=-=-=-");
		}
		System.out.println(test.getClass());	
	}
}