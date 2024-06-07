package br.com.nobrecoder.operations;

import java.util.Arrays;

/* Aqui temos o exemplo de uma classe com um método estático simples que desejamos que fique acessível para módulos
 * externos.
 * */

public class Aula01_Operations {
	
	
	/**
	 * <h1>Objetivo</h1>
	 * Fazer soma entre vários números de ponto flutuante.<br>
	 * Recebe um varchar de números de ponto flutuante e retorna a soma deles.<br><br>
	 * */
	public static double sum(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (t, u) -> (t + u));
	}
}
