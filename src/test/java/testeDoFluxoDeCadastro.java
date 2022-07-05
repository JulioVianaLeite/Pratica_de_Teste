import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import actions.fluxoDeCadastroAcoes;
import pages.fluxoDecadastroPagina;
import utils.Constantes;
import utils.DriverContext;

public class testeDoFluxoDeCadastro {

	WebDriver driver;
	fluxoDeCadastroAcoes action;

	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constantes.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://www.aprendendotestar.com.br/treinar-automacao.php");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		action = new fluxoDeCadastroAcoes();
	}
	
	@Test
	void test() throws InterruptedException {
		Thread.sleep(2000);
		action.clicarUsuario("Teste1");
		action.clicarSenha("qualquersenha");
		action.clicarNome("Julio");
		action.clicarEnviar();
		String verificar = driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText();
		System.out.println(verificar);
	}
	
	
	@AfterEach
	void tearDown() throws Exception {
		//Thread.sleep(10000);
		//driver.quit();
	}
	
	
}
