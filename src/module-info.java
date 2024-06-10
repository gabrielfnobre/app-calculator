/* 
 * Veja neste exemplo como estamos usando nossos requires e exports, neste exemplo esse módulo é:
 * 
 * 		* Essencial para o módulo "app.finance" (o que quer dizer que app-finance é dependente do
 * 			módulo "app.calculo";
 * 
 * */

module app.calculator { //Aqui temos o bloco do nosso módulo, onde definimos o nome do módulo os requires e exports dele 
	exports br.com.nobrecoder.operations; //Neste exemplo estamos exportando todo o pacote operations, o que quer dizer todas as classes dentro desse pacote estarão disponíveis para uso do pacote dependente. Se por um acaso tivéssemos um pacote interno ao pacote operations, ele não estaria visível, pois todos os pacotes visíveis para os módulos externos devem ser exportados sem excessão.
	requires transitive app.logger; //Note que também que temos uma dependência com o módulo "app.logger", mas como temos um módulo pai que deverá usar o nosso módulo, não queremos ter que tornar o nosso módulo pai dependente do "app.logger" também só para que possamos utilizar o método que está nesse módulo. Por isso, passamos essa dependência de forma transitiva ao módulo pai, é como se disséssemos ao módulo pai: "o seu filho tem uma dependência com um módulo terceira, por favor permita que ele possa utilizá-la". O transitive permite que essa dependência possa acontecer.
	exports br.com.nobrecoder.operations.multiple to app.finance; //Note que o "exports to" é muito mais direto, pois definimos após o "to" para qual módulo desejamos exportar nosso pacote, essa exportação direcional faz com que o modulepath saiba que pacote vai utilizar as classes do nosso pacote sem a necessidade de usarmos "requires" por parte do pacote dependente. (Lembre-se que poderíamos exportar esse pacote para quantos módulos quiséssemos, bastaria apenas separar os nomes dos módulos por vírgula).
	exports br.com.nobrecoder.operations.animal to app.finance; //Note que estamos exportando diretamente o pacote "animal" para o módulo "app-finance" (Lembre-se que poderíamos exportar esse pacote para quantos módulos quiséssemos, bastaria apenas separar os nomes dos módulos por vírgula).
	opens br.com.nobrecoder.operations.animal; //Note também que tornamos o pacote "animal" acessível para reflexão por através da palavra reservada "opens", poderíamos deixar quantos pacotes quiséssemos deixar disponiveis no "opens", bastaria apenas colocar os nomes dos pacotes separados por vírgula.
}