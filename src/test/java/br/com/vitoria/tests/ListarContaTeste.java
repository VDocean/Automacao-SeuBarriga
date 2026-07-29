package br.com.vitoria.tests;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.vitoria.core.BasePage;
import br.com.vitoria.core.DriverFactory;
import br.com.vitoria.pages.CriarContas;
import br.com.vitoria.pages.ListarContasPage;

public class ListarContaTeste {
	
	CriarContas page;
	BasePage base;
	ListarContasPage contas;
	
	@BeforeEach
	public void inicializa() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/login");
		page=new CriarContas();
		base=new BasePage();
		contas=new ListarContasPage();
		base.login("chicotesta@teste.com","123");
	
	}
	
	@Test
	public void listaContas() {
		contas.clicaBTContas();
		contas.clicaBTListar();
		contas.editarConta();
		contas.excluirConta();
	}

}
