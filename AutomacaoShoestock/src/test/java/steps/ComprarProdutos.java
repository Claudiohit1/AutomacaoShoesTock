package steps;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import metodosget.MetodosGetStock;

public class ComprarProdutos {

	MetodosGetStock metodos = new MetodosGetStock();
	Elementos el = new Elementos();
	
	//@Dado("que clique em x")
	//public void queCliqueEmX() throws InterruptedException {
		//metodos.clicarX(el.clicarX);
		//Thread.sleep(3000);
	   
	//}

	@Dado("que aceite os cookies")
	public void queAceiteOsCookies() throws InterruptedException {
		metodos.aceitarCookies(el.aceitarCookies);
		Thread.sleep(3000);

	}

	@Dado("clique em novidades")
	public void cliqueEmNovidades() throws InterruptedException {
		metodos.clicarNovidades(el.clicarNovidades);
		Thread.sleep(3000);

	}

	@Dado("clique no produto desejado")
	public void cliqueNoProdutoDesejado() throws InterruptedException {
		metodos.escolherProduto(el.escolherProduto);
		Thread.sleep(4000);

	}

	//@Dado("escolha a cor")
	//public void escolhaACor() throws InterruptedException {
		//metodos.escolherCor(el.escolherCor);
		//metodos.scrollNaTela(0, 200);
		//Thread.sleep(4000);

	//}

	@Dado("escolha o tamanho")
	public void escolhaOTamanho() throws InterruptedException {
		metodos.escolherNumero(el.escolherNumero);
		Thread.sleep(3000);

	}

	@Dado("clique em comprar")
	public void cliqueEmComprar() throws InterruptedException {
		metodos.clicarComprar(el.clicarComprar);
		Thread.sleep(3000);

	}

	@Dado("esvazie o carrinho")
	public void esvazieOCarrinho() throws InterruptedException {
		metodos.clicarExcluir(el.clicarExcluir);
		Thread.sleep(3000);

	}

	@Dado("queira voltar a pagina principal")
	public void queiraVoltarAPaginaPrincipal() throws InterruptedException {
		metodos.clicarVoltarMenu(el.clicarVoltarAoMenu);
		Thread.sleep(2000);

	}

	 @Entao("o sistema retorna com sucesso")
	 public void oSistemaRetornaComSucesso() {

	 }

}
































