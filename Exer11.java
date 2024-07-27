/* .Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo. { = (num1 * 2) + (num2/2) }
b. a soma do triplo do primeiro com o terceiro. { num1 * 3) + num3 }
c. o terceiro elevado ao cubo. { Math.pow(num3,3) ou (num3*num3*num3) }  */

package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número inteiro: ");
		int num1 = ler.nextInt();
		System.out.println("Entre com o segundo número inteiro: ");
		int num2 = ler.nextInt();
		System.out.println("Entre com um número real: ");
		double num3 = ler.nextDouble();
		
		double resultado1 = (num1 * 2)+ (num2/2) ;
		double resultado2 = (num1 * 3) + num3;
		double resultado3 = Math.pow(num3, 3);
		// ou (num3*num3*num3)
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);
		
		
	}
}
