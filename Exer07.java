/* Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário. */

package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Entre com o lado do quadrado: ");
		double lado = ler.nextDouble();
		
		//area= lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println("A area do quadrado é: " + area );
		System.out.println("O dobro do quadrado é: " + (area * 2));
		
	}
}
