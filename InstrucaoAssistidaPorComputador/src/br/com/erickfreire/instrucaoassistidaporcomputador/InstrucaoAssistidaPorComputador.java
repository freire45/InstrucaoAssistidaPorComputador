package br.com.erickfreire.instrucaoassistidaporcomputador;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Programa em Java que ajuda um aluno a aprender multiplicação
 * @author Erick Freire
 * @vesion 1 - Criado em 14-05-2021 as 14:39
 *
 */

public class InstrucaoAssistidaPorComputador {

	public static void main(String[] args) {
		
		System.out.println("Programa que ajuda aprender multiplicação");
		
		multiplicacao();

	}
	
	public static void multiplicacao() {
		
		int numero1;
		int numero2;
		int multiplicacao;
		int resposta;
		
		SecureRandom numeroAleatorio = new SecureRandom();
		Scanner entrada = new Scanner(System.in);
		
		numero1 = numeroAleatorio.nextInt(10);
		numero2 = numeroAleatorio.nextInt(10);
		multiplicacao = numero1 * numero2;
		
		System.out.printf("%nQuanto é %d * %d ?%n", numero1, numero2);
		resposta = entrada.nextInt();
		
		if(resposta == multiplicacao) {
			System.out.println("Muito Bem!");
		} else {
			while(resposta != multiplicacao) {
				System.out.printf("%nResposta Incorreta! Tente de novo! Quanto é %d * %d ?%n", numero1, numero2);
				resposta = entrada.nextInt();
			}
			System.out.println("Muito Bem!");
		}
	}

}
