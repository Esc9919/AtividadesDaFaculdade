package br.com.faculdade.emerson;

import java.util.Scanner;

public class PrecoProduto {

	public static void main(String[] args) {
		
		Scanner resp = new Scanner(System.in);
		int q;
		double p;
		double vc;
		double vd;
		double vpg;
		
		System.out.println("Quantidade: ");
		q = resp.nextInt();
		
		System.out.println("Preco: ");
		p = resp.nextDouble();
		
		vc = p * q;
		
		vd = vc * 0.05;
		
		vpg = vc - vd;
		
		System.out.println("O valor total e: " + vc + ", O valor do desconto e: " + vd + 
				", O valor a ser pago e: " + vpg);
		
		
	}
}
