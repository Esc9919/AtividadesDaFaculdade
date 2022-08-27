package br.com.faculdade.emerson;

import java.util.Scanner;

public class MediaDoAluno {

	public static void main(String[] args) {

		Scanner resp = new Scanner(System.in);
		double n1;
		double n2;
		double m;
		
		System.out.println("Qual a primeira nota do aluno? ");
		n1 = resp.nextDouble();
		
		System.out.println("Qual a segunda nota do aluno? ");
		n2 = resp.nextDouble();
		
		m = (n1 + n2) / 2;
		
		System.out.println("A media do aluno e: " + m);
		
		if (m >= 5) {
			System.out.println("Aluno aprovado!");
		} else if(m < 5) {
			System.out.println("Aluno reprovado!");
		}
		
	}

}
