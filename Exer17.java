package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("***Loja de tintas***");
		
		System.out.println("Quantos metros quadrados devem ser pintados: ");
		double tamanho = ler.nextDouble();
		
		double litros = (tamanho / 3.0);
		double latas = (litros / 18.0);
		
		if (litros / 18 != 0) {
			//se a qtd de litro for diferente de 18
			latas += 1;
			//adicione 1 lata a mais.
		}
		
		System.out.println("Você deve comprar " + latas + " latas.");
		System.out.println("O valor total a pagar é: " + latas*80);
		
		
	}
}
