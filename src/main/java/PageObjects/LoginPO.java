package PageObjects;

import org.openqa.selenium.WebDriver;

import Utils.DSL;


public class LoginPO {
	
	
	private DSL dsl;
	
	public LoginPO(WebDriver driver){
		dsl = new DSL(driver);
	}

	public void AcessarLogin(){
		dsl.clicarBotao("login-button");
	}

	
	public void Logar() {
		dsl.escrever("username", "nnn");
		dsl.escrever("password", "nnn");
		dsl.clicarBotao("login-button");
	}
	
}