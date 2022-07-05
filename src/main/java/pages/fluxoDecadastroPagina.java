package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;



public class fluxoDecadastroPagina {

	public fluxoDecadastroPagina(){
		PageFactory.initElements(DriverContext.getDriver(), this);
	}    
	
	
	@FindBy(how=How.XPATH, using="//tbody/tr[2]/td[1]/input[1]")
	protected WebElement uUsuario;
	
	@FindBy(how=How.XPATH, using="//tbody/tr[4]/td[1]/input[1]")
	protected WebElement sSenha;
	
	@FindBy(how=How.XPATH, using="//tbody/tr[6]/td[1]/input[1]")
	protected WebElement nNome;
	
	@FindBy(how=How.XPATH, using="//tbody/tr[7]/td[1]/input[1]")
	protected WebElement eEnviar;
	
	@FindBy(how=How.XPATH, using="//tbody/tr[7]/td[1]/input[1]")
	protected WebElement Enviar;
	
	@FindBy(how=How.XPATH, using="//tbody/tr[2]/td[3]")
	protected WebElement textoUsuario;
	
	@FindBy(how=How.XPATH, using="/html/body/section/section[2]/div/table/tbody/tr[2]/td[4]")
	protected WebElement textoSenha;
	
	@FindBy(how=How.XPATH, using="/html/body/section/section[2]/div/table/tbody/tr[2]/td[2]")
	protected WebElement textoNome;
	
	@FindBy(how=How.XPATH, using="//tbody/tr[2]/td[5]/a[1]")
	protected WebElement textoApagar;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
