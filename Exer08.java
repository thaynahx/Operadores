package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora: ");
		double valorHora = ler.nextDouble();
		System.out.println("Qual o n�mero de horas trabalhadas no m�s: ");
		int horas = ler.nextInt();
		
		System.out.println("Valor/Hora: " + valorHora);
		System.out.println("Horas trabalhadas: " + horas);
		System.out.println("Sal�rio total � de: " + valorHora*horas);
	
		
		
		
	}
}
