package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em farenheit: ");
		double f = ler.nextDouble();
		
		double c = (5 * (f-32) / 9);
		
		System.out.println("A temperatura em farenheit " + f + "\né igual a temperatura em Celcius " + c + "º."  );
		
		
	}
}
