package br.com.emerson;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner resposta = new Scanner(System.in);
		int n1;
		int n2;
		int soma;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = resposta.nextInt();
		
		System.out.println("Digite o ano segundo numero: ");
		n2 = resposta.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("O resultado da soma dos dois numeros e: " + soma);
	}

}
