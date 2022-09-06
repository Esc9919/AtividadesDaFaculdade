package br.com.emerson;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner resp = new Scanner(System.in);
		int calc;
		
		System.out.println("-------------------------------------------------");
		System.out.println("Qual das operações sera realizada? 1 mult, 2 sub, 3 div e 4 soma ");
		calc = resp.nextInt();
		
		System.out.println("-------------------------------------------------");
		
		
		switch(calc){
		case 1:
			Div div = new Div();
			
			break;
		case 2:
			Soma soma = new Soma();
			break;
		case 3:
			Mult mult = new Mult();
			break;
		case 4:
			Sub sub = new Sub();
			break;
		
		}
		
		
	}

}
