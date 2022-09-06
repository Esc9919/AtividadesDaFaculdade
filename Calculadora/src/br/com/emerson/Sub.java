package br.com.emerson;

import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {

		Scanner resposta = new Scanner(System.in);
		int n1;
		int n2;
		int sub;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = resposta.nextInt();
		
		System.out.println("Digite o ano segundo numero: ");
		n2 = resposta.nextInt();
		
		sub = n1 - n2;
		
		System.out.println("O resultado da subtracao dos dois numeros e: " + sub);
	}

}
