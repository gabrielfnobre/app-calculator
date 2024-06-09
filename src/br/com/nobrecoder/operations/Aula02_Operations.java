package br.com.nobrecoder.operations;

import java.util.Arrays;
import br.com.nobrecoder.logging.Info;

/* Aqui vemos que a classe atual necessita utilizar um método que está disponível apenas no módulo de 
 * "app-logger", esse método é o "showInfo", que irá mostrar a data atual em que uma execução ocorre.
 * Note que o nosso método "sumInfo" dessa classe tem o objetivo de fazer a soma de um conjunto de 
 * números e além disso mostrar a data em que a soma foi feita!
 * 
 * Veja o arquivo "module-info.java", para ver que além de fazermos a requisição do módulo de "app-
 * logger", nós também usamos a palavra reservada "transitive", para mostrar que o nosso módulo tem
 * uma dependência com outro módulo que deverá ser informada a um módulo pai, para que possamos uti-
 * lizá-la.
 * */

public class Aula02_Operations {
	
	public static double sumInfo(double... nums) {
		System.out.println(Info.showInfo());
		return Arrays.stream(nums).reduce(0.0, (t, u) -> t + u);
	}
	
}
