package br.com.emerson;

import java.util.Scanner;

public class Div {

	public static void main(String[] args) {
		
		Scanner resposta = new Scanner(System.in);
		int n1;
		int n2;
		int div;

		System.out.println("Digite o primeiro numero: ");
		n1 = resposta.nextInt();

		System.out.println("Digite o ano segundo numero: ");
		n2 = resposta.nextInt();

		div = n1 / n2;

		System.out.println("O resultado da divisao dos dois numeros e: " + div);
	}

}
