package br.com.financiamento.steps.definition;

import org.springframework.test.context.ContextConfiguration;

import br.com.financiamento.steps.business.StepBusiness;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinition {

	@Steps
	StepBusiness stepB;
	
	@Given("^estou na pagina inicial do site \"([^\"]*)\"$")
	public void estou_na_pagina_inicial_do_site(String url) throws Throwable {
	 stepB.openHome(url);
	}

	@When("^clico em 'linkHabitacao'$")
	public void clico_em_linkHabitacao() throws Throwable {
		stepB.clicarHabitacao();
	}

	@When("^clico em 'linkSimulador'$")
	public void clico_em_linkSimulador() throws Throwable {
		stepB.clicarSimulador();
	}

	@When("^seleciono pessoa \"([^\"]*)\"$")
	public void seleciono_pessoa(String pessoa) throws Throwable {
	    stepB.selecionaPessoa(pessoa);
	}

	@When("^preencho tipo \"([^\"]*)\"$")
	public void preencho_tipo(String tipoFinanciamento) throws Throwable {
		stepB.tipoFinanciamento(tipoFinanciamento);
	}

	@When("^preencho 'categoria' \"([^\"]*)\"$")
	public void preencho_categoria(String categoria) throws Throwable {
		stepB.categoriaImovel(categoria);
	}

	@When("^preencho 'valorImovel' \"([^\"]*)\"$")
	public void preencho_valorImovel(String valor) throws Throwable {
		stepB.valorImovel(valor);
	}

	@When("^preencho 'uf' \"([^\"]*)\"$")
	public void preencho_uf(String uf) throws Throwable {
		stepB.localUf(uf);
	}

	@When("^preencho 'cidade' \"([^\"]*)\"$")
	public void preencho_cidade(String cidade) throws Throwable {
		stepB.localImovel(cidade);
	}

	@When("^clico no botão 'proximaEtapa'$")
	public void clico_no_botão_proximaEtapa() throws Throwable {
		stepB.clicarProximaEtapa();
	}
	
	@When("^preencho 'cpf' \"([^\"]*)\"$")
	public void preencho_cpf(String cpf) throws Throwable {
		stepB.cpf(cpf);
	}

	@When("^preencho 'numeroCelular' \"([^\"]*)\"$")
	public void preencho_numeroCelular(String celular) throws Throwable {
		stepB.numeroCelular(celular);
	}

	@When("^preencho 'rendaBrutaFamiliar' \"([^\"]*)\"$")
	public void preencho_rendaBrutaFamiliar(String renda) throws Throwable {
		stepB.rendaBrutaMensal(renda);
	}

	@When("^preencho 'dataNascimento' \"([^\"]*)\"$")
	public void preencho_dataNascimento(String data) throws Throwable {
		stepB.dataNascimento(data);
	}

	@When("^clico no botão 'proximaBtnEtapa'$")
	public void clico_no_botão_proximaBtnEtapa() throws Throwable {
		stepB.clicarProximaEtapa2();
	}

	@When("^clivo no botão 'taxaBalcao'$")
	public void clivo_no_botão_taxaBalcao() throws Throwable {
		stepB.clicarTaxabalcao();
	}

	@Then("^sistema apresenta o financiamento 'Resultados'$")
	public void sistema_apresenta_o_financiamento_Resultados() throws Throwable {
	
	}
	

}