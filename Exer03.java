package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		System.out.println("Entre com o primeiro n�mero:");
		int num1 = ler.nextInt();
		System.out.println("Entre com o segundo n�mero:");
		int num2 = ler.nextInt();
		
		double resultado = num1 + num2;
		System.out.println("N�mero 1: " + num1 + "\nN�mero 2: " +  num2 + " \nResultado: " + resultado);
		
		
		
		
	}
}
