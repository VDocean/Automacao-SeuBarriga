package br.com.vitoria.pages;

import br.com.vitoria.core.BasePage;

public class ResumoMensalPage {
	
	BasePage page= new BasePage();
	
	public void clicaBTResumo() {
		page.clicarBotaoXpath("//a[text()='Resumo Mensal']");
	}
	public void selecionaMes(String mes) {
		page.obterValorCombo("mes",mes);
	}
	
	public void selecionaAno(String ano) {
		page.obterValorCombo("ano",ano);
	}
	
	public void clicaBTSalvar() {
		page.clicarBotaoXpath("//input[@type='submit']");
	}
}
