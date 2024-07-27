/* Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total. */

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
