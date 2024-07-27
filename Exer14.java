/* João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na
variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO. */

package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("***João Papo-de-Pescador***");
		
		System.out.println("Entre com o peso dos peixes: ");
		double peso = ler.nextDouble();
		
		double excesso = 0;
		double multa = 0;
		
		if (peso <= 50) {
			System.out.println("Não há excesso de peso. Excesso: " + excesso);
			System.out.println("Não há multa a ser registrada. Multa: "+ multa);
		} else {
			//se o peso for acima de 50kg, registre o excesso e a multa
			excesso = peso - 50;
			multa = excesso * 4;
			
			System.out.println("O peso ultrapassou o limite. Excesso de: " + excesso);
			System.out.println("Multa a ser registrada é de: R$ "+ multa);
		}
		
	}
}
