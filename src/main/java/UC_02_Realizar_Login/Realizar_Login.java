package UC_02_Realizar_Login;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.HomePO;
import PageObjects.LoginPO;
	

public class Realizar_Login{
	
	
	private WebDriver driver;
	private HomePO hpo;
	private LoginPO lpo;
	
	@Before
	public void Inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1920,1080));
		driver.get("http://127.0.0.1:5000/");
		hpo = new HomePO(driver);
		lpo = new LoginPO(driver);
	}
		
	@After
	public void Finaliza() {
		driver.quit();
	}
		
	
	@Test
	public void RealizarLogin() {
		hpo.AcessarPerfil();
		lpo.Logar();
	}
	
}
