package br.com.faculdade.emerson;

import java.util.Scanner;

public class ReajusteDeSalario {

	public static void main(String[] args) {

		Scanner resp = new Scanner(System.in);
		double sl;
		double r;
		double sf;
		
		System.out.println("Qual o salario do funcionario? ");
		sl = resp.nextDouble();
		
		r = sl * 0.1;
		
		sf = sl + r;
		
		System.out.println("O valor do reajuste e: " + r + ", O salario final e: " + sf);
		
		
		
		
	}

}
