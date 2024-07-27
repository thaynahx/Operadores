/* .Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit. o F = (c * 1.8) + 32 */

package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Celcius: ");
		double c = ler.nextDouble();
		
		double f = (c * 1.8) + 32;
		
		System.out.println("A temperatura graus Celcius " + c + "ºC \né igual a temperatura Farenheit " + f + "ºF. ");                                                           
		
		
	}
}
