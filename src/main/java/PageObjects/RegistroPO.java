package PageObjects;

import org.openqa.selenium.WebDriver;

import Utils.DSL;


public class RegistroPO {
	
	
	private DSL dsl;
	
	public RegistroPO(WebDriver driver){
		dsl = new DSL(driver);
	}
	

	
	public void AcessarLogin(){
		dsl.clicarBotao("login-button");
	}
	
	public void AcessarRegistro(){
		dsl.clicarBotao("register-button");
	}
	
	public void Registrar() {
		dsl.escrever("username", "nnn");
		dsl.escrever("password", "nnn");
		dsl.escrever("confirm_password", "nnn");
		dsl.clicarBotao("register-button");
	}
	
	public void Logar() {
		dsl.escrever("username", "nnn");
		dsl.escrever("password", "nnn");
		dsl.clicarBotao("login-button");
	}
	
}