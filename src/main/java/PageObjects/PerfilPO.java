package PageObjects;


import org.openqa.selenium.WebDriver;

import Utils.DSL;


public class PerfilPO {
	
	
	private DSL dsl;
	
	public PerfilPO(WebDriver driver){
		dsl = new DSL(driver);
	}
	

	
	public void AcessarPerfil(){
		dsl.clicarBotao("user-info");
	}
	

	public void AcessarCarrinho(){
		dsl.clicarBotao("my-account-btn");
	}
	
	public void RealizarLogout(){
		dsl.clicarBotao("my-account-btn");
	}
	
	public void DesativarAssinatura() {
		dsl.clicarBotaoXpath("//button[contains(text(),'Desativar Assinatura')]");
	}
	

	
	public String obterAssinaturaDesativada(){
		 return dsl.obterValorCampoXpath("//body[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/p[4]");
	}
	
}