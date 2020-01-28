package br.com.william.desbravandojava.orientacaoobjetos.classe;

public class Modifcadores{
	/*
	Modificadores:
	
		#public: deixa o atributo ou metodo no formato publico,
		que pode ser acessado por QUALQUER classe.
	
		#private: deixa o atributo ou metodo no formato private,
		que pode ser acessado APENAS pela sua classe.
	
		#protected: deixa o atributo ou metodo no formato protected,
		que pode ser acessado por classes FILHAS ou de MESMO pacote.
		

		Se não especificado o atributo ou metodo se torna amigavel que 
		em resumo só pode ser usado por classes do mesmo pacote. 
		-Modificadores de uso:
			#final: uma especie de constante public ex Math.PI.
			#static: esse isola o acesso apenas para a classe ou seja
			quando utilizo 'new' não é criada nem static pois ela já existe 
			,por exemplo static int x=0; 'x' é utilizado apenas pela Classe
			e não por objetos!
	*/

	public String nome;
	private int id;
	protected String filhas;
	final float PI=3.1415f;


}