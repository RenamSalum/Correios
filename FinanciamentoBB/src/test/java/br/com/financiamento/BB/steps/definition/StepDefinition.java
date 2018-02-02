package br.com.financiamento.BB.steps.definition;

import org.springframework.test.context.ContextConfiguration;

import br.com.financiamento.BB.steps.business.StepBusiness;
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

	@When("^preencho tipo \"([^\"]*)\"$")
	public void preencho_tipo(String tipoFinanciamento) throws Throwable {
		stepB.tipoImovel(tipoFinanciamento);
	}

	@When("^preencho 'categoria' \"([^\"]*)\"$")
	public void preencho_categoria(String categoriaImovel) throws Throwable {
		stepB.categoriaImovel(categoriaImovel);
	}
	
	@When("^seleciono 'empreendimentoBB' \"([^\"]*)\"$")
	public void seleciono_empreendimentoBB(String empreendimentoBB) throws Throwable {
		stepB.empreendimentoBB(empreendimentoBB);
	}

	@When("^seleciono  \"([^\"]*)\"$")
	public void seleciono(String empreendimentoBB) throws Throwable {
		stepB.empreendimentoBB(empreendimentoBB);
	}

	@When("^preencho 'uf' \"([^\"]*)\"$")
	public void preencho_uf(String uf) throws Throwable {
		stepB.uf(uf);
	}

	@When("^preencho 'cidade' \"([^\"]*)\"$")
	public void preencho_cidade(String cidade) throws Throwable {
		stepB.localImovel(cidade);
	}
	
	
	@When("^seleciono 'possuiImovel' \"([^\"]*)\"$")
	public void seleciono_possuiImovel(String possuiImovel) throws Throwable {
		stepB.possuiImovel(possuiImovel);
	}

	@When("^preencho 'valorImovel' \"([^\"]*)\"$")
	public void preencho_valorImovel(String valorImovel) throws Throwable {
		stepB.valorImovel(valorImovel);
	}

	@When("^clico no botão 'btnContinuar'$")
	public void clico_no_botão_btnContinuar() throws Throwable {
		stepB.clicabtnContinuar();
	}
	
	@When("^preencho 'cpf' \"([^\"]*)\"$")
	public void preencho_cpf(String cpf) throws Throwable {
		stepB.cpf(cpf);
	}

		
	@When("^seleciono  'fgtsMaiorTres' \"([^\"]*)\"$")
	public void seleciono_fgtsMaiorTres(String fgtsMaiorTres) throws Throwable {
		stepB.possuiFgtsMaiorTresAnos(fgtsMaiorTres);
	}

	@When("^seleciono  'fgtsMaiorDez>' \"([^\"]*)\"$")
	public void seleciono_fgtsMaiorDez(String fgtsMaiorDez) throws Throwable {
		stepB.possuiFgtsMaiorDezAnos(fgtsMaiorDez);
	}

	@When("^seleciono  'beneficiarioFgts' \"([^\"]*)\"$")
	public void seleciono_beneficiarioFgts(String beneficiarioFgts) throws Throwable {
		stepB.beneficiarioFgts(beneficiarioFgts);
	}

	@When("^seleciono  'segundoComprador' \"([^\"]*)\"$")
	public void seleciono_segundoComprador(String segundoComprador) throws Throwable {
		stepB.segundoComprador(segundoComprador);
	}

	@When("^seleciono  'pmcmv' \"([^\"]*)\"$")
	public void seleciono_pmcmv(String pmcmv) throws Throwable {
		stepB.legislacaoPmcmv(pmcmv);
	}

	@When("^preencho 'renda' \"([^\"]*)\"$")
	public void preencho_renda(String renda) throws Throwable {
		stepB.rendaBrutaMensal(renda);
	}

	@When("^clico no botão 'BtnSeusDados'$")
	public void clico_no_botão_BtnSeusDados() throws Throwable {
		stepB.clicaBtnSeusDados();
	}
	
	@When("^preencho 'data_nascimento' \"([^\"]*)\"$")
	public void preencho_data_nascimento(String data) throws Throwable {
		stepB.dataNascimento(data);
	}

	@When("^preencho 'valorFinanciamento' \"([^\"]*)\"$")
	public void preencho_valorFinanciamento(String valorFinancioamento) throws Throwable {
		stepB.valorFinanciamento(valorFinancioamento);
	}

	@When("^preencho 'prazoFinanciamento' \"([^\"]*)\"$")
	public void preencho_prazoFinanciamento(String prazoFinanciamento) throws Throwable {
	stepB.ParcelasFinanciamento(prazoFinanciamento);
	}

	@When("^clico no botão 'BtnValorFinanciamento'$")
	public void clico_no_botão_BtnValorFinanciamento() throws Throwable {
		stepB.clicaBtnValorFinanciamento();
	}
	
	@When("^seleciono 'taxaBalcao'$")
	public void seleciono_taxaBalcao() throws Throwable {
		stepB.selecionaTaxaBalcao();
	}

	@Then("^clico no botão 'BtnSeleciona'$")
	public void clico_no_botão_BtnSeleciona() throws Throwable {
		stepB.clicaBtnSeleciona();
	}
	
}