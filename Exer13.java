/* .Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
 . Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou
abaixo do peso. */

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
			System.out.println("Peso ideal para a sua altura é: " + pesoIdeal);
		}else if (peso >= pesoIdeal){
			System.out.println("Está acima do peso ideal! ");
		}else if (peso == pesoIdeal) {
			System.out.println("Está dentro do peso ideal!");
		}else if (peso <= pesoIdeal) {
			System.out.println("Está abaixo do peso ideal!");
		}
		
		//peso ideal Feminino
		if (sexo.equalsIgnoreCase("F")||sexo.equalsIgnoreCase("f")) {
			pesoIdeal = (62.1*altura) - 44.7;
			System.out.println("Peso ideal para a sua altura é: " + pesoIdeal);
		}else if (peso >= pesoIdeal) {
			System.out.println("Está acima do peso ideal! ");
		}else if (peso == pesoIdeal) {
			System.out.println("Está dentro do peso ideal!");
		}else if (peso <= pesoIdeal) {
			System.out.println("Está abaixo do peso ideal!");
		}
		
		
		
		
	}
}
