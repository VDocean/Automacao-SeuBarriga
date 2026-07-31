package br.com.vitoria.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.vitoria.core.BasePage;
import br.com.vitoria.core.DriverFactory;
import br.com.vitoria.pages.ResumoMensalPage;

public class ResumoMensalTeste {
	
	ResumoMensalPage page;
	BasePage base;
	
	@BeforeEach
	public void inicializa() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/login");
		page=new ResumoMensalPage();
		base=new BasePage();
		base.login("chicotesta@teste.com","123");
	}
	
	@Test
	public void exibeResumo() {
		page.clicaBTResumo();
		page.selecionaMes("Julho");
		page.selecionaAno("2026");
		page.clicaBTSalvar();
		base.clicaBTSair();
		
	}

}
