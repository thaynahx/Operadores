package com.thaynah.coursejava.aula13;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		int valor1 = 10;
		int valor2 = 17;
		
		//Esta opera��p retorna um boolean mesmo que a vari�vel n�o seja declarada
		//true / false
		System.out.println("valor1 == valor2: " + (valor1 == valor2));
		System.out.println("valor1 != valor2: " + (valor1 != valor2));
		System.out.println("valor1 > valor2: " + (valor1 > valor2));
		System.out.println("valor1 >= valor2: " + (valor1 >= valor2));
		System.out.println("valor1 < valor2: " + (valor1 < valor2));
		System.out.println("valor1 <= valor2: " + (valor1 <= valor2));
	}

}
