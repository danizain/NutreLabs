package UC_04_Desativar_Assinatura;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomePO;
import PageObjects.LoginPO;
import PageObjects.PerfilPO;
	

public class Desativar_Assinatura{
	
	
	private WebDriver driver;
	private HomePO hpo;
	private LoginPO lpo;
	private PerfilPO epo;
	
	@Before
	public void Inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1920,1080));
		driver.get("http://127.0.0.1:5000/");
		hpo = new HomePO(driver);
		lpo = new LoginPO(driver);
		epo = new PerfilPO(driver);
	}
		
	@After
	public void Finaliza() {
		driver.quit();
	}
		
	
	@Test
	public void RelizarCompras() {
		hpo.AcessarPerfil();
		lpo.Logar();
		epo.AcessarPerfil();
		epo.DesativarAssinatura();
	}
	
}
