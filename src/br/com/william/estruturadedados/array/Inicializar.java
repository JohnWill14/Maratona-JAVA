package br.com.william.estruturadedados.array;

public class Inicializar{
	public static void main(String[] args) {
		int[] array=new int[5];
		int[] array2={2,4,5,6,7};
		int[] array3=new int[]{2,4,5,6,7};
		for(int i:array ){
			System.out.println("=> "+i);
		}
		System.out.println("***");
		for(int i=0;i<array2.length ;i++ ){
			System.out.println("["+i+"] => "+array2[i]);
		}
		System.out.println("***");
		for(int i=0;i<array3.length ;i++ ){
			System.out.println("["+i+"] => "+array3[i]);
		}

	}
}