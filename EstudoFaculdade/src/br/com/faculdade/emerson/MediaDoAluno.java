package br.com.faculdade.emerson;

import java.util.Scanner;

public class MediaDoAluno {

	public static void main(String[] args) {

		Scanner resp = new Scanner(System.in);
		double n1;
		double n2;
		double m;
		String nome;
		
		System.out.println("Qual o nome do aluno? ");
		nome = resp.next();
		
		System.out.println("Qual a primeira nota? ");
		n1 = resp.nextDouble();
		
		System.out.println("Agora a segunda nota? ");
		n2 = resp.nextDouble();
		
		m = (n1 + n2) / 2;
		
		System.out.println("A media do aluno " + nome + " e: " + m);
		
		if (m >= 5) {
			System.out.println("O Aluno " + nome +" foi aprovado!");
		} else {
			System.out.println("O Aluno " + nome + " foi reprovado!");
		}
		
	}

}
