package br.com.william.estruturadedados.inicio;

public class Enum{
	public enum Day{MON,TU,WED,THU,FRI,SAT,SUN};
	public static void main(String args[]){
		Day dia=Day.WED;
		Day amanha=Day.valueOf("THU");
		Day dia2=Day.valueOf("WED");
		System.out.println("Hj -> "+dia);
		System.out.println("amanha -> "+amanha);
		System.out.println("hj == hj2 -> "+(dia==dia2));//Compara o valor Meio que referencia para a mesma coisa	
	}

}
