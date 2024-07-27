package com.thaynah.coursejava.aula13;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args){
		
		Scanner ler =new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora: ");
		double valorHora = ler.nextDouble();
		System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
		double horas = ler.nextDouble();
		
		double salarioBruto = valorHora*horas;
		
		double IR = (salarioBruto/100) * 11;
		double INSS = (salarioBruto/100) * 8;
		double sindicato = (salarioBruto/100) * 5;
		
		double descontos = IR + INSS + sindicato;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("Imposto de renda:" + IR);
		System.out.println("INSS:" + INSS);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Total de descontos: " + descontos);
		System.out.println("Salário Líquido: " + salarioLiquido);
		
		
		
		
		
		
		
		
	}
}
