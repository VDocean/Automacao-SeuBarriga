package br.com.vitoria.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.vitoria.core.BasePage;
import br.com.vitoria.core.DriverFactory;

public class ListarContasPage {
	
	BasePage page = new BasePage();
	CriarContas contaEdit= new CriarContas();
	
	public void clicaBTContas() {
		page.clicarBotaoXpath("//a[contains(text(),'Contas')]");
	}
	
	public void clicaBTListar() {
		page.clicarBotaoXpath("//a[.='Listar']");
	}
	
	public void editarConta() {
		page.clicarBotaoXpath("//tr[1]/td[2]/a[contains(@href,'editarConta')]");
		contaEdit.preencheNome("Conta Editada");
		contaEdit.clicaBTSalvar();
	}
	
	public void excluirConta() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(
		    By.xpath("//tr[2]/td[2]/a[contains(@href,'removerConta')]")
		)).click();
		
		
	}
	
	

}
