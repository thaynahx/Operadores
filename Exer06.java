package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Entre com o raio do círculo: ");
		double raio = ler.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("o Valor da area é:" + area + ".");
		
		//tive dificuldade
	}
}
