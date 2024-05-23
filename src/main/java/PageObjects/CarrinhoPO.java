package PageObjects;


import org.openqa.selenium.WebDriver;


import Utils.DSL;


public class CarrinhoPO {
	
	
	private DSL dsl;
	
	public CarrinhoPO(WebDriver driver){
		dsl = new DSL(driver);
	}
	
	
	public void AcessarPerfil(){
		dsl.clicarBotao("my-account-btn");
	}
	

	public void AcessarCarrinho(){
		dsl.clicarBotao("my-orders-btn");
	}
	
	public void RealizarLogout(){
		dsl.clicarBotao("logoutt-btn");
	}
	
	public void ConfirmarCarrinho() {
		dsl.clicarBotao("checkout-btn");
	}
	
	public void RemoverProduto() {
		dsl.clicarBotao("register-button");
	}
}