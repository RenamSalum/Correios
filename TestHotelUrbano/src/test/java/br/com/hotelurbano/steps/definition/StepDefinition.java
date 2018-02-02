package br.com.hotelurbano.steps.definition;

import org.springframework.test.context.ContextConfiguration;

import br.com.hotelurbano.steps.business.StepBusiness;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinition {

	@Steps
	StepBusiness stepB;
	
/////////////////////////CT01//////////////////////////////////////////////////////////////////////
	
	@Given("^estou na pagina inicial do site \"([^\"]*)\"$")
	public void estou_na_pagina_inicial_do_site(String url)  {
	     stepB.abrirBrowser(url);
	}

	@When("^clico em 'btnHoteis'$")
	public void clico_em_btnHoteis()   {
	     stepB.clicarBtnHoteis();
	     
	}

	@When("^preencho 'campoBusca' \"([^\"]*)\"$")
	public void preencho_campoBusca(String campoPesquisar)   {
	     stepB.preencherCampoPesquisar(campoPesquisar);
	     
	}

	@When("^clico no botão 'btnBuscar'$")
	public void clico_no_botão_btnBuscar() throws Throwable   {
	     stepB.clicarBtnBuscar();
	     
	}

	@When("^seleciono 'chkboxcategoria'$")
	public void seleciono_chkboxcategoria() throws Throwable   {
	    stepB.clicarChkBoxCincoEstrelas(); 
	     
	}

	@When("^seleciono 'hotel'$")
	public void seleciono_hotel() throws Throwable   {
	     stepB.selecionaHotel();
	     
	}

	@Then("^verifico se é hotel (\\d+) estrelas 'Resultado'$")
	public void verifico_se_é_hotel_estrelas_Resultado() throws Throwable   {
	    // stepB.resultado();
	     
	}
	
/////////////////////////CT02//////////////////////////////////////////////////////////////////////	
	
	
	@When("^clico em 'btnAerio'$")
	public void clico_em_btnAerio() throws Throwable {
	     stepB.clicarBtnAerios();
	     
	}

	@When("^preencho 'campoOrigem' \"([^\"]*)\"$")
	public void preencho_campoOrigem(String campoIda) throws Throwable {
	     stepB.preencherCampoIda(campoIda);
	     
	}

	@When("^preencho 'campoDestino' \"([^\"]*)\"$")
	public void preencho_campoDestino(String campoVolta) throws Throwable {
	     stepB.preencherCampoVolta(campoVolta);
	     
	}

	@When("^seleciono 'selecionoDataIda' \"([^\"]*)\"$")
	public void seleciono_selecionoDataIda(String campoIda) throws Throwable {
	     stepB.preencherData(campoIda);
	     
	}

	@When("^seleciono 'selecionoDataVolta' \"([^\"]*)\"$")
	public void seleciono_selecionoDataVolta(String arg1) throws Throwable {
	     
	     
	}

	@When("^preeencho 'campoTipoPassgem' \"([^\"]*)\"$")
	public void preeencho_campoTipoPassgem(String arg1) throws Throwable {
	     
	     
	}

	@When("^clico no botão 'BtnBusca'$")
	public void clico_no_botão_BtnBusca() throws Throwable {
	     
	     
	}

	@Then("^sistema apresenta o cep ou endereço pesquisado 'Resultado'$")
	public void sistema_apresenta_o_cep_ou_endereço_pesquisado_Resultado() throws Throwable {
	     
	     
	}
	
	
	
	
	
/////////////////////////CT03//////////////////////////////////////////////////////////////////////	

	
	
	
/////////////////////////CT04//////////////////////////////////////////////////////////////////////	

	
	

/////////////////////////CT05//////////////////////////////////////////////////////////////////////	
	
	

	
	
	
}