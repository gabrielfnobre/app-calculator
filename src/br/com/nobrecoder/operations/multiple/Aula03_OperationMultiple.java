package br.com.nobrecoder.operations.multiple;

import java.util.Arrays;

public class Aula03_OperationMultiple {
	
	/**
	 * <h1>Objetivo</h1><br>
	 * Receber um conjunto de números e multiplicá-los um pelos outros.
	 * */
	public static double multiple(double... nums) {
		return Arrays.stream(nums).reduce(1.0, (t, u) -> (t * u));
	}
	
}
