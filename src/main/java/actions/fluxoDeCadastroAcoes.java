package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.fluxoDecadastroPagina;
import utils.DriverContext;

public class fluxoDeCadastroAcoes extends fluxoDecadastroPagina {
	protected WebDriverWait wait;
	
	public fluxoDeCadastroAcoes(){
		wait = new WebDriverWait(DriverContext.getDriver(), 60);
	}
	

	public void clicarUsuario(String usuario){
		wait.until(ExpectedConditions.visibilityOf(uUsuario)).sendKeys(usuario);
	}
	
	public void clicarSenha(String senha){
		wait.until(ExpectedConditions.visibilityOf(sSenha)).sendKeys(senha);
	}
	
	public void clicarNome(String nome){
		wait.until(ExpectedConditions.visibilityOf(nNome)).sendKeys(nome);
	}
	
	public void clicarEnviar() {
		wait.until(ExpectedConditions.elementToBeClickable(eEnviar)).click();
	}
	
	public String verificarEImprimirTextoUsuario() {
		return wait.until(ExpectedConditions.visibilityOf(textoUsuario)).getText();
	}
	
	public String verificarEImprimirTextoSenha() {
		return wait.until(ExpectedConditions.visibilityOf(textoSenha)).getText();
	}
	
	public String verificarEImprimirTextoNome() {
		return wait.until(ExpectedConditions.visibilityOf(textoNome)).getText();
	}
	
	public void clicarApagar() {
		wait.until(ExpectedConditions.elementToBeClickable(textoApagar)).click();
	}
	
	

}
