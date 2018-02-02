package br.com.correios.steps.definition;

import org.springframework.test.context.ContextConfiguration;

import br.com.correios.steps.business.StepBusiness;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinition {

	@Steps
	StepBusiness stepB;
	
	/////////////////////////CT01 e CT02//////////////////////////////////////////////////////////////////////
	
	@Given("^estou na pagina inicial do site \"([^\"]*)\"$")
	public void estou_na_pagina_inicial_do_site(String url)  {
	     stepB.abrirBrowser(url);
	}

	@When("^clico em 'btnBuscaCepEnd'$")
	public void clico_em_btnBuscaCepEnd()  {
		stepB.clicarBtnBusca();
	}

	@When("^preencho 'campoBusca' \"([^\"]*)\"$")
	public void preencho_campoBusca(String campoBusca)  {
	     stepB.preencherCampoBusca(campoBusca); 
	}

	@When("^seleciono 'campoCepDe' \"([^\"]*)\"$")
	public void seleciono_campoCepDe(String campoCepDe)  {
	     stepB.preencherCampoCepDe(campoCepDe);	     
	}

	@When("^clico no botão 'BtnBuscar'$")
	public void clico_no_botão_BtnBuscar()  {
	     stepB.clicarBtnBuscar();	     
	}

	@Then("^sistema apresenta o cep ou endereço pesquisado 'Resultado'$")
	public void sistema_apresenta_o_cep_ou_endereço_pesquisado_Resultado() throws Throwable  {
	 stepB.resultado();    
	     
	}
	
/////////////////////////CT03//////////////////////////////////////////////////////////////////////	
	
	@When("^clico em 'btnBuscaPrescoPrazos'$")
	public void clico_em_btnBuscaPrescoPrazos() {
		stepB.clicarBtnBuscaPrecoPrazos(); 
	}

	@When("^preencho 'campoDataPostagem'$")
	public void preencho_campoDataPostagem() throws Throwable {
		stepB.preencherCampoDataPostagem();    
	}

	@When("^preencho 'campoOrigem' \"([^\"]*)\"$")
	public void preencho_campoOrigem(String campoOrigem) {
		stepB.preencherCampoOrigem(campoOrigem); 
	}

	@When("^preencho 'campoDestino' \"([^\"]*)\"$")
	public void preencho_campoDestino(String campoDestino) {
		stepB.preencherCampoDestino(campoDestino); 
	}

	@When("^seleciono 'campoTipoServico' \"([^\"]*)\"$")
	public void seleciono_campoTipoServico(String campoTipoServico) {
		stepB.preencherCampoTipoServico(campoTipoServico); 
	}

	@When("^clico no botão 'formatoCaixa'$")
	public void clico_no_botão_formatoCaixa() {
		stepB.SelecinarFormatoCaixa(); 
	}

	@When("^seleciono 'campoEmbalagem' \"([^\"]*)\"$")
	public void seleciono_campoEmbalagem(String campoEmbalagem) throws Throwable {
		stepB.preencherCampoEmbalagem(campoEmbalagem);
	}

	@When("^preencho 'dimensaoAltura' \"([^\"]*)\"$")
	public void preencho_dimensaoAltura(String dimensaoAltura) {
		stepB.preencherDimensaoAltura(dimensaoAltura);
	}

	@When("^preencho 'dimensaoLargura' \"([^\"]*)\"$")
	public void preencho_dimensaoLargura(String dimensaoLargura) {
		stepB.preencherDimensaoLargura(dimensaoLargura);
	}

	@When("^preencho 'dimensaoComprimento' \"([^\"]*)\"$")
	public void preencho_dimensaoComprimento(String dimensaoComprimento) {
		stepB.preencherDimensaoComprimento(dimensaoComprimento);
	}

	@When("^seleciono peso 'campoPeso' \"([^\"]*)\"$")
	public void seleciono_peso_campoPeso(String campoPeso) {
		stepB.preencherCampoPeso(campoPeso);
	}

	@When("^seleciono checkbox 'ckboxAvisoRecebimento'$")
	public void seleciono_checkbox_ckboxAvisoRecebimento() {
		stepB.SelecinarChkboxAvisoRecebimento();
	}

	@When("^clico no botão 'btnEnviar'$")
	public void clico_no_botão_btnEnviar() throws Throwable {
	 stepB.clicarBtnEnviar();
 
	}

	@Then("^sistema apresenta os preços e prazos da consulta 'Resultado'$")
	public void sistema_apresenta_os_preços_e_prazos_da_consulta_Resultado() throws Throwable {
		stepB.resultado();
 
	}
	
/////////////////////////CT04//////////////////////////////////////////////////////////////////////	

	
	@When("^clico em 'btnRedeAtendimento'$")
	public void clico_em_btnRedeAtendimento(){
	    stepB.clicarBtnRedeAtendimento(); 
	}

	@When("^seleciono 'chkboxTipoBusca' \"([^\"]*)\"$")
	public void seleciono_chkboxTipoBusca(String chkboxTipoBusca){
	     stepB.selecionarChkboxTipoBusca(chkboxTipoBusca);
	}

	@When("^preencho 'campoEstado' \"([^\"]*)\"$")
	public void preencho_campoEstado(String campoEstado) throws Throwable{
	     stepB.preencherCampoEstado(campoEstado); 
	}

	@When("^preencho 'campoMunicipio' \"([^\"]*)\"$")
	public void preencho_campoMunicipio(String campoMunicipio) throws Throwable{
	    stepB.preencherCampoMunicipio(campoMunicipio);   
	}

	@When("^preencho 'campoBairro' \"([^\"]*)\"$")
	public void preencho_campoBairro(String campoBairro){
	     stepB.preencherCampoBairro(campoBairro);
	}

	@When("^seleciono 'btnDetalheAgencia' \"([^\"]*)\"$")
	public void seleciono_btnDetalheAgencia(String btnDetalheAgencia){
	     stepB.clicarBtnDetalheAgencia(btnDetalheAgencia);
	}

	@Then("^sistema apresenta os detalhes da agencia 'Resultado'$")
	public void sistema_apresenta_os_detalhes_da_agencia_Resultado() throws Throwable {
	     stepB.resultado();
	     
	}

/////////////////////////CT05//////////////////////////////////////////////////////////////////////	
	
	

	@When("^Pega Cep 'tabelaCep'$")
	public void pega_Cep_tabelaCep() throws Throwable {
		stepB.pegarCepNaTabela();
	     
	}

	@When("^clico no botão 'BtnNovaconsulta'$")
	public void clico_no_botão_BtnNovaconsulta() throws Throwable {
	   stepB.clicarBtnNovaConsulta();  
	     
	}

	@When("^Navego para 'url' \"([^\"]*)\"$")
	public void navego_para_url(String url) throws Throwable {
	     stepB.NavegarPara(url);
	     
	}

	@When("^preencho 'campoOrigem'$")
	public void preencho_campoOrigem() throws Throwable {
	     stepB.preencherCampoOrigem();
	     
	}

	@When("^preencho 'campoDestino'$")
	public void preencho_campoDestino() throws Throwable {
		stepB.preencherCampoDestino();
	     
	}
	
	
	
}