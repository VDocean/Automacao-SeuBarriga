package br.com.vitoria.tests;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.vitoria.core.BasePage;
import br.com.vitoria.core.DriverFactory;
import br.com.vitoria.pages.CriarContas;
import br.com.vitoria.pages.LoginPage;
import br.com.vitoria.pages.NovoUsuario;

public class CriarContaTeste {
	
	
	CriarContas page;
	BasePage base;
	@BeforeEach
	public void inicializa() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/login");
		page=new CriarContas();
		base=new BasePage();
		base.login("chicotesta@teste.com","123");
	
	}
	
	@Test
	public void adicionaConta() {
		page.clicaBTContas();
		page.clicarBTAdicionar();
		page.preencheNome("Conta Corrente");
		page.clicaBTSalvar();
		
	}
	


}
