package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Informe com a sua altura:  ");
		double altura = ler.nextDouble();
		
		System.out.println("informe com o sexo: (F-M)");
		String sexo =ler.next();
		
		double pesoIdeal = 0;
		
		System.out.println("Informe seu peso: ");
		double peso =ler.nextDouble();
		
		//peso ideal masculino
		if (sexo.equalsIgnoreCase("M")||sexo.equalsIgnoreCase("m")) {
			pesoIdeal = (72.7*altura) - 58;
			System.out.println("Peso ideal para a sua altura �: " + pesoIdeal);
		}else if (peso >= pesoIdeal){
			System.out.println("Est� acima do peso ideal! ");
		}else if (peso == pesoIdeal) {
			System.out.println("Est� dentro do peso ideal!");
		}else if (peso <= pesoIdeal) {
			System.out.println("Est� abaixo do peso ideal!");
		}
		
		//peso ideal Feminino
		if (sexo.equalsIgnoreCase("F")||sexo.equalsIgnoreCase("f")) {
			pesoIdeal = (62.1*altura) - 44.7;
			System.out.println("Peso ideal para a sua altura �: " + pesoIdeal);
		}else if (peso >= pesoIdeal) {
			System.out.println("Est� acima do peso ideal! ");
		}else if (peso == pesoIdeal) {
			System.out.println("Est� dentro do peso ideal!");
		}else if (peso <= pesoIdeal) {
			System.out.println("Est� abaixo do peso ideal!");
		}
		
		
		
		
	}
}
