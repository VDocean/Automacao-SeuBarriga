package br.com.vitoria.pages;

import br.com.vitoria.core.BasePage;

public class NovoUsuario {
	
	BasePage page= new BasePage();
	
	public void cadastraNovoUser() {
		page.clicarBotaoXpath("//nav//a[contains(normalize-space(.), 'Novo usuário?')]");
		
	}

}
