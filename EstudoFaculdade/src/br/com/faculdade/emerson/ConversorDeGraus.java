package br.com.faculdade.emerson;

import java.util.Scanner;

public class ConversorDeGraus {

	public static void main(String[] args) {

		Scanner resp = new Scanner(System.in);
		int c;
		int f;
		
		System.out.println("Qual a temperatura em Graus Celsius? ");
		c = resp.nextInt();
		
		f = (c*9/5) + 32;
		
		System.out.println("a temperatura em Fahrenheit e: " + f);
		
	}

}
