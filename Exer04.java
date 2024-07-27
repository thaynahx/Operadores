/* Faça um Programa que peça as 4 notas bimestrais e mostre a média. */

package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Digite a 1ª nota: :");
		double nota1 = ler.nextDouble();
		System.out.println("Digite a 2ª nota: :");
		double nota2 = ler.nextDouble();
		System.out.println("Digite a 3ª nota: :");
		double nota3 = ler.nextDouble();
		System.out.println("Digite a 4ª nota: :");
		double nota4 = ler.nextDouble();
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Nota 3: " + nota3);
		System.out.println("Nota 4: " + nota4);
		double media = ((nota1 + nota2 + nota3 + nota4)/4);
		System.out.println("Média bimestral: " + media);
		
		
		
		
	}
}
