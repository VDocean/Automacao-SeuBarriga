package br.com.vitoria.pages;

import br.com.vitoria.core.BasePage;

public class LoginPage {
	
	BasePage login= new BasePage();
	
	
	public void setEmail(String email) {
		login.escrever("email",email);
	}
	
	public void setSenha(String senha) {
		login.escrever("senha",senha);
	
	}
	
	public void entrar() {
		login.clicarBotaoXpath("//button[normalize-space()='Entrar']");
	}


}
