package br.com.vitoria.pages;

import br.com.vitoria.core.BasePage;

public class CriarMovimentacaoPage {
	
	BasePage page=new BasePage();
	
	public void clicaBTCriarMovimentacao() {
		page.clicarBotaoXpath("//a[contains(text(),'Criar Movimentação')]");
	}
	
	public void TipoDeMovimentacaoReceita() {
		page.selecionarCombo("tipo","Receita");
	}
	
	public void TipoDeMovimentacaoDespesa() {
		page.selecionarCombo("tipo","Despesa");
	}
	
	public void DataDaMovimentacao(String texto) {
		page.escrever("data_transacao", texto);
	}
	
	public void DataDoPagamento(String texto) {
		page.escrever("data_pagamento", texto);
	}
	
	public void Descricao(String texto) {
		page.escrever("descricao", texto);
	}
	
	public void Interessado(String texto) {
		page.escrever("interessado", texto);
	}
	
	public void Valor(String texto) {
		page.escrever("valor", texto);
	}
	
	
	public void SelecionaConta(String nomeConta) {
		page.selecionarCombo("conta",nomeConta);
	}
	
	public void SituacaoPago() {
		page.clicarRadio("status_pago");
	}
	
    public void SituacaoPendente() {
    	page.clicarRadio("status_pendente");
	}
    
    public void clicaBTCSalvar() {
		page.clicarBotaoXpath("//button[@type='submit']");
	} 
	

}
