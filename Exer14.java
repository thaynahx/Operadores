package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("***Jo�o Papo-de-Pescador***");
		
		System.out.println("Entre com o peso dos peixes: ");
		double peso = ler.nextDouble();
		
		double excesso= 0;
		double multa=0;
		
		if (peso <= 50) {
			System.out.println("N�o h� excesso de peso. Excesso: " + excesso);
			System.out.println("N�o h� multa a ser registrada. Multa: "+ multa);
		} else {
			excesso = peso - 50;
			multa = excesso * 4;
			
			System.out.println("O peso ultrapassou o limite. Excesso de: " + excesso);
			System.out.println("Multa a ser registrada � de: R$ "+ multa);
		}
		
	}
}
