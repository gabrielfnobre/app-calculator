/* 
 * Veja neste exemplo como estamos usando nossos requires e exports, neste exemplo esse módulo é:
 * 
 * 		* Essencial para o módulo "app.finance" (o que quer dizer que app-finance é dependente do
 * 			módulo "app.calculo";
 * 
 * */

module app.calculator { //Aqui temos o bloco do nosso módulo, onde definimos o nome do módulo os requires e exports dele 
	exports br.com.nobrecoder.operations; //Neste exemplo estamos exportando todo o pacote operations, o que quer dizer todas as classes dentro desse pacote estarão disponíveis para uso do pacote dependente. Se por um acaso tivéssemos um pacote interno ao pacote operations, ele não estaria visível, pois todos os pacotes visíveis para os módulos externos devem ser exportados sem excessão.
}