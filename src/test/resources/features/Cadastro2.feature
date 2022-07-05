@CadastroNovo
Feature: Cadastro em site de teste

	Background: Abrir o site
		Given o usuario acessa o site "http://www.aprendendotestar.com.br/treinar-automacao.php"

  @Cadastro1
  Scenario Outline: Acessar site
    And  preencha o campo usuario com "<usuario>", "<senha>" no campo senha, "<nome>" no campo nome 
    When acionado o botao enviar
    Then o usuario poderar ver que seu novo usuario "<usuario>", senha  "<senha>" e "<nome>" foi cadastrado no site
		And  podera apagar esse usuario
    
    Examples: 
      | usuario  | senha  |  nome  |
     	| Teste1   |  9898  |  Julio |