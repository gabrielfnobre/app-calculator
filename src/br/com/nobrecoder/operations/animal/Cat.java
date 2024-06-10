package br.com.nobrecoder.operations.animal;

/* Note que o atributo "meow" é privado, portanto, não deveria ser possível acessá-lo sem o uso de reflexão!
 * */

public class Cat {
	
	private String meow = "Miauu!!";

	public String getMeow() {
		return meow;
	}
}
