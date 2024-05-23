package PageObjects;


import org.openqa.selenium.WebDriver;

import Utils.DSL;


public class HomePO {
	
	
	private DSL dsl;
	
	public HomePO(WebDriver driver){
		dsl = new DSL(driver);
	}
	public void AcessarProdutos(){
		dsl.clicarBotao("arrow");
	}
	
	public void AcessarPerfil(){
		dsl.clicarBotao("my-account-btn");
	}
	
	public void AcessarLogin(){
		dsl.clicarBotao("login-button");
	}
	
	public void AcessarRegistro(){
		dsl.clicarBotao("register-button");
	}
	public void AcessarCarrinho(){
		dsl.clicarBotao("my-account-btn");
	}
	
	public void RealizarLogout(){
		dsl.clicarBotao("logout-btn");
	}

}