/*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link 
de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link 
(em minutos).*/

package Exercicio_13;

import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {
    
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho de um arquivo para download (em MB): ");
		double tamArquivo = ler.nextDouble();
		System.out.println("Entre com velocidade de um link de Internet (em Mbps): ");
		double velInternet = ler.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		System.out.println("O tempo de download é igual a: " + tempo + " min");
		
	}

	
}











