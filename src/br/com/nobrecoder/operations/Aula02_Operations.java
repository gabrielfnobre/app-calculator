package br.com.nobrecoder.operations;

import java.util.Arrays;

import br.com.nobrecoder.logging.Info;

public class Aula02_Operations {
	
	public static double sumInfo(double... nums) {
		System.out.println(Info.showInfo());
		return Arrays.stream(nums).reduce(0.0, (t, u) -> t + u);
	}
	
}
