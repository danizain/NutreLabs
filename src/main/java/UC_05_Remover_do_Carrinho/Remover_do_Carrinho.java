package UC_05_Remover_do_Carrinho;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.CarrinhoPO;
import PageObjects.HomePO;
import PageObjects.LoginPO;
import PageObjects.ProdutosPO;
	

public class Remover_do_Carrinho{
	
	
	private WebDriver driver;
	private HomePO hpo;
	private ProdutosPO ppo;
	private CarrinhoPO cpo;
	private LoginPO lpo;
	
	@Before
	public void Inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1920,1080));
		driver.get("http://127.0.0.1:5000/");
		hpo = new HomePO(driver);
		ppo = new ProdutosPO(driver);
		cpo = new CarrinhoPO(driver);
		lpo = new LoginPO(driver);
	}
		
	@After
	public void Finaliza() {
		driver.quit();
	}
		
	
	@Test
	public void RelizarCompras() {
		hpo.AcessarPerfil();
		lpo.Logar();
		hpo.AcessarProdutos();
		ppo.AdicionarAoCarrinho();
		ppo.AcessarCarrinho();
		cpo.RemoverProduto();

	}
	
}
