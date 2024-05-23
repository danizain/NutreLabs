package PageObjects;

import org.openqa.selenium.WebDriver;

import Utils.DSL;

public class ResumoPedidoPO {
	
	
	private DSL dsl;
	
	public ResumoPedidoPO(WebDriver driver){
		dsl = new DSL(driver);
	}
	
	
	public void AcessarPerfil(){
		dsl.clicarBotao("my-account-btn");
	}
	

	public void AcessarCarrinho(){
		dsl.clicarBotao("my-account-btn");
	}
	
	public void RealizarLogout(){
		dsl.clicarBotao("my-account-btn");
	}
	
	
	public void ConfirmarAssinatura() {
		dsl.escrever("frequency_days", "12");
		dsl.escrever("zip_code", "09892400");
		dsl.escrever("house_number", "26");
		dsl.clicarBotao("register-button");
	}

}