package PageObjects;

import org.openqa.selenium.WebDriver;

import Utils.DSL;


public class ProdutosPO {
	
	
	private DSL dsl;
	
	public ProdutosPO(WebDriver driver){
		dsl = new DSL(driver);
	}

	public void AcessarPerfil(){
		dsl.clicarBotao("my-account-btn");
	}
	
	public void AcessarCarrinho(){
		dsl.clicarBotao("my-orders-btn");
	}
	
	public void RealizarLogout(){
		dsl.clicarBotao("my-account-btn");
	}
	
	public void AdicionarAoCarrinho() {
		dsl.clicarBotaoXpath("//body/section[@id='cart']/div[1]/div[1]/div[1]/form[1]/button[1]");
	}
	
	
	
}