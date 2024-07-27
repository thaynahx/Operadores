/*Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número]. */

package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = ler.nextInt();
		
		System.out.println("O número informado foi: " + num + ".");
		
	}

}
