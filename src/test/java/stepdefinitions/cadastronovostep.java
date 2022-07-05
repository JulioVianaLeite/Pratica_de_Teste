package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverPrincipal;
import actions.fluxoDeCadastroAcoes;

public class cadastronovostep {

	DriverPrincipal principal = new DriverPrincipal();
	WebDriver driver = principal.AbrirUrl();
	fluxoDeCadastroAcoes action = PageFactory.initElements(driver, fluxoDeCadastroAcoes.class);
	
	public cadastronovostep() throws Exception {
		
	}
		
		
		@Given("o usuario acessa o site {string}")
		public void o_usuario_acessa_o_site(String link) {
			driver.get(link);
			driver.manage().window().maximize();
		}
		
		@And("preencha o campo usuario com {string}, {string} no campo senha, {string} no campo nome")
		public void preencha_o_campo_usuario_com_no_campo_senha_no_campo_nome(String usuario, String senha, String nome) {
		  action.clicarUsuario(usuario);
		  action.clicarSenha(senha);
		  action.clicarNome(nome);
		}

		@When("acionado o botao enviar")
		public void acionado_o_botao_enviar() {
		  action.clicarEnviar();  
		}

		@Then("o usuario poderar ver que seu novo usuario {string}, senha  {string} e {string} foi cadastrado no site")
		public void o_usuario_poderar_ver_que_seu_novo_usuario_senha_e_foi_cadastrado_no_site(String usuario, String senha, String nome) throws InterruptedException {
			Thread.sleep(2000);
			assertEquals( usuario, action.verificarEImprimirTextoUsuario());
			Thread.sleep(2000);
			assertEquals( senha, action.verificarEImprimirTextoSenha());
			Thread.sleep(2000);
			assertEquals( nome, action.verificarEImprimirTextoNome());
			System.out.println("Usuario � " + action.verificarEImprimirTextoUsuario() + " " + "Senha � " + action.verificarEImprimirTextoSenha() + " " + "Nome � "+ action.verificarEImprimirTextoNome());
		}
		
		@And ("podera apagar esse usuario")
		public void poder_apagar_esse_usuario() throws InterruptedException {
			Thread.sleep(5000);
		   action.clicarApagar();
		}
	
		   
}

