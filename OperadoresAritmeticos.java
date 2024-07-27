package com.thaynah.coursejava.aula13;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1+2;
		System.out.println("Soma: " + resultado);
		
		resultado = resultado - 1;
		System.out.println("Sub: " + resultado);
		 
		resultado = resultado * 2;
		System.out.println("Multiplicação: "+resultado);
		
		resultado = resultado / 2;
		System.out.println("Div: "+ resultado);
		
		resultado = resultado + 8;
		System.out.println("Soma do último resultado: " + resultado);
		
		resultado = resultado % 7;
		System.out.println("Resto da divisão: " + resultado + "\n");
		
	//-------------------
		// concatenação com o operador "+"
		
		String primeiraString = "Esta é ";
		String segundaString = "uma String concatenada \n";
		String terceiraString = primeiraString + segundaString;
		System.out.println(terceiraString);
		
	//-------------------	
		//continuação com a variavel de resultado
		//resultado a ultima opeção foi 3
		//4
		resultado = resultado +1;
		System.out.println(resultado);
		
		//5
		resultado++;
		System.out.println(resultado);
		
		//primeiro irei impreimir o resultado e depois adiciona o valor
		System.out.println(resultado++);
			//  mesma coisa que:
			//	resultado = resultado +1;
			//	System.out.println(resultado);
			//	resultado += 1;
	//--------------------------------------
		//adiona o valor a string e depois fazer o output dela
		System.out.println(++resultado);
			//mesma coisa que:
			// resultado += 1;
		 	// System.out.println(resultado);
		
	//---------------------------------------
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);
				
	}
}
