package Utils;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL{
	
	private WebDriver driver;
	

	public DSL(WebDriver driver) {
		this.driver = driver;
		
	}

	/********* TextField e TextArea ************/
	
	public void escrever(By by, String texto){
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto){
		escrever(By.id(id_campo), texto);
	}
	
	public String obterValorCampo(String id_campo) {
		return driver.findElement(By.id(id_campo)).getAttribute("value");
	}
	
	public String obterValorCampoXpath(String id_campo) {
		return driver.findElement(By.xpath(id_campo)).getAttribute("value");
	}
	
	/********* Radio e Check ************/
	
	public void clicarRadio(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public boolean isRadioMarcado(String id){
		return driver.findElement(By.id(id)).isSelected();
	}
	
	public void clicarCheck(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public boolean isCheckMarcado(String id){
		return driver.findElement(By.id(id)).isSelected();
	}
	
	/********* Combo ************/
	
	public void selecionarCombo(String id, String valor) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public void deselecionarCombo(String id, String valor) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		combo.deselectByVisibleText(valor);
	}

	public String obterValorCombo(String id) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}
	
	public List<String> obterValoresCombo(String id) {
		WebElement element = driver.findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for(WebElement opcao: allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}
	
	public int obterQuantidadeOpcoesCombo(String id){
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}
	
	/********* Botao ************/
	

	public void clicarBotao(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public void clicarBotaoXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	
	public String obterValueElemento(String id) {
		return driver.findElement(By.id(id)).getAttribute("value");
	}
	
	public String obterValueElementoXpath(String xpath) {
		return driver.findElement(By.xpath(xpath)).getAttribute("value");
	}
	
	/********* Link ************/
	
	public void clicarLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}
	
	/********* Textos ************/
	
	public String obterTexto(By by) {
		return driver.findElement(by).getText();
	}
	
	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}
	
	
	/*********  Janelas ************/
	
	public void trocarJanela(String id) {
		driver.switchTo().window(id);
	}
}
