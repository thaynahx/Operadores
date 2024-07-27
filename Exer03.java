package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		System.out.println("Entre com o primeiro número:");
		int num1 = ler.nextInt();
		System.out.println("Entre com o segundo número:");
		int num2 = ler.nextInt();
		
		double resultado = num1 + num2;
		System.out.println("Número 1: " + num1 + "\nNúmero 2: " +  num2 + " \nResultado: " + resultado);
		
		
		
		
	}
}
