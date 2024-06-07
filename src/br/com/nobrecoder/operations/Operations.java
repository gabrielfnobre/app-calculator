package br.com.nobrecoder.operations;

import java.util.Arrays;

public class Operations {
	
	public static double sum(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (t, u) -> (t + u));
	}
}
