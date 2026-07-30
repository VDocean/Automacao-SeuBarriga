package br.com.vitoria.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.vitoria.core.BasePage;
import br.com.vitoria.core.DriverFactory;
import br.com.vitoria.pages.CriarMovimentacaoPage;

public class CriarMovimencaoTeste {
	
	CriarMovimentacaoPage page;
	BasePage base;
	@BeforeEach
	public void inicializa() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/login");
		page=new CriarMovimentacaoPage();
		base=new BasePage();
		base.login("chicotesta@teste.com","123");
	}
	 
	
	
	@Test
	public void cadastraReceita() {
		
		page.clicaBTCriarMovimentacao();
		page.TipoDeMovimentacaoReceita();
		page.DataDaMovimentacao("30/07/2026");
		page.DataDoPagamento("05/08/26");
		page.Descricao("none");
		page.Interessado("eu");
		page.Valor("300");
		page.SelecionaConta("Conta Editada");
		page.SituacaoPendente();
		page.clicaBTCSalvar();
	}
		
	
	
	@Test
	public void cadastraDespesa() {
		page.clicaBTCriarMovimentacao();
		page.TipoDeMovimentacaoDespesa();
	    page.DataDaMovimentacao("04/07/2026");
		page.DataDoPagamento("15/08/2026");
		page.Descricao("none");
		page.Interessado("eu");
		page.Valor("1000");
		page.SelecionaConta("Conta Editada");
		page.SituacaoPago();
		page.clicaBTCSalvar();
		
	}
		
	}


