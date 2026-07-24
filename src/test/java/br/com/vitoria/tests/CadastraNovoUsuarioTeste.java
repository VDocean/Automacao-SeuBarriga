package br.com.vitoria.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.vitoria.core.DriverFactory;
import br.com.vitoria.pages.LoginPage;
import br.com.vitoria.pages.NovoUsuario;

public class CadastraNovoUsuarioTeste {
	
	  LoginPage pageLogin;
	  NovoUsuario pageCadastro;
	
	@BeforeEach
	public void inicializa() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/login");
		pageLogin=new LoginPage();
		pageCadastro=new NovoUsuario();
	}
	 
	
	@Test
	public void novoCadastro() {
		pageCadastro.cadastraNovoUser();
	}
}
