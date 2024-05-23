package UC_01_Realizar_Cadastro;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.HomePO;
import PageObjects.RegistroPO;
	

public class Realizar_Cadastro{
	
	
	private WebDriver driver;
	private HomePO hpo;
	private RegistroPO rpo;
	
	@Before
	public void Inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1920,1080));
		driver.get("http://127.0.0.1:5000/");
		hpo = new HomePO(driver);
		rpo = new RegistroPO(driver);
	}
		
	@After
	public void Finaliza() {
		driver.quit();
	}
		
	
	@Test
	public void RealizarCadastro() {
		hpo.AcessarPerfil();
		hpo.AcessarRegistro();
		rpo.Registrar();
	}
	
}
