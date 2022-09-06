package br.com.faculdade.emerson;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {

		Scanner resposta = new Scanner(System.in);
		String nome;
		int at;
		int an;
		int sub;
		
		System.out.println("Qual o seu nome? ");
		nome = resposta.next();
		
		System.out.println(nome + ", agora irei calcular sua idade.");
		
		System.out.println("");
		
		System.out.println(nome + ", por favor digite o ano atual: ");
		at = resposta.nextInt();
		
		System.out.println("Agora digite o ano de nascimento: ");
		an = resposta.nextInt();
		
		sub = at - an;
		
		System.out.println(nome + " a sua idade e: " + sub);
		
	}

}
