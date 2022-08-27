package br.com.faculdade.emerson;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {

		Scanner resposta = new Scanner(System.in);
		int at;
		int an;
		int sub;
		
		System.out.println("Digite o ano atual: ");
		at = resposta.nextInt();
		
		System.out.println("Digite o ano de nascimento: ");
		an = resposta.nextInt();
		
		sub = at - an;
		
		System.out.println("A sua idade e: " + sub);
		
	}

}
