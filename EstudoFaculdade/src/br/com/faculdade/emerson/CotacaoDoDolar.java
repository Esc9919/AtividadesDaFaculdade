package br.com.faculdade.emerson;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CotacaoDoDolar {

	public static void main(String[] args) {

		Scanner resposta = new Scanner(System.in);
		double cot;
		double dol;
		double real;
		
		System.out.println("Qual a cotacao atual do Dolar hoje? ");
		cot = resposta.nextDouble();
		
		System.out.println("Quanto em Dolar voce gostaria de converter para a moeda Real? ");
		dol = resposta.nextDouble();
		
		real = dol * cot;
		
		System.out.println("O valor Real que voce tera e: R$" + real);
		
		
				
		
	}

}
