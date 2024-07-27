/* Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês. */

package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora: ");
		double valorHora = ler.nextDouble();
		System.out.println("Qual o número de horas trabalhadas no mês: ");
		int horas = ler.nextInt();
		
		System.out.println("Valor/Hora: " + valorHora);
		System.out.println("Horas trabalhadas: " + horas);
		System.out.println("Salário total é de: " + valorHora*horas);
	
		
		
		
	}
}
