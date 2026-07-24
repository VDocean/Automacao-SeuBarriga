package br.com.vitoria.pages;

import br.com.vitoria.core.BasePage;

public class CriarContas {
	
	BasePage page=new BasePage();
	
	public void clicaBTContas() {
		page.clicarBotaoXpath("//a[contains(text(),'Contas')]");
	}
	
	public void clicarBTAdicionar() {
		page.clicarBotaoXpath("//a[text()='Adicionar']");
	}
	
	public void preencheNome(String nomeConta) {
		page.escrever("nome", nomeConta);;
	}
	
	public void clicaBTSalvar() {
		page.clicarBotaoXpath("//button[.='Salvar']");
	}


}
