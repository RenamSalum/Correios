package br.com.financiamento.BB.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectClass extends PageObject{

	@FindBy(xpath ="id('faixa1')/div[2]/div[1]/label[2]/input[1]")
	private WebElement residencial;	
	
	@FindBy(xpath ="id('faixa1')/div[2]/div[1]/label[3]/input[1]")
	private WebElement comercial;
	
	@FindBy(xpath ="id('faixa1')/div[2]/div[2]/label[2]")
	private WebElement novo;
	
	@FindBy(xpath ="id('faixa1')/div[2]/div[2]/label[3]")
	private WebElement usado;
	
	@FindBy(xpath ="id('idEmpreendimento')/div[1]/label[2]")
	private WebElement financiadoBb;
	
	@FindBy(xpath ="id('idEmpreendimento')/div[1]/label[3]")
	private WebElement naoFinanciadoBb;
	
	@FindBy(xpath ="id('s2id_formulario:comboUFs')")
	private WebElement uf;
	
	@FindBy(xpath ="//*[@id='s2id_autogen1_search']")
	private WebElement searchUf;
	
	@FindBy(xpath ="id('s2id_formulario:comboMunicipios')")
	private WebElement cidade;
	
	@FindBy(xpath ="//*[@id='s2id_autogen39_search']")
	private WebElement searchCidade;
	
	@FindBy(xpath ="//*[@id='faixa1']/div[2]/div[5]/label[2]/input")
	private WebElement possuiImovel;
	
	@FindBy(xpath ="//*[@id='faixa1']/div[2]/div[5]/label[3]/input")
	private WebElement naopossuiImovel;
	
	@FindBy(xpath ="id('formulario:valorImovel')")
	private WebElement valorImovel;
	
	@FindBy(xpath ="id('btnSobreImovel')")
	private WebElement btnContinuar;
	
	@FindBy(xpath ="//*[@id='formulario:numeroCpf']")
	private WebElement cpf;
	
	@FindBy(xpath ="id('formulario:dataNascimento')")
	private WebElement dataNascimento;
	
	@FindBy(xpath ="id('faixa2')/div[2]/div[2]/label[2]")
	private WebElement possuiFgts;
	
	@FindBy(xpath ="id('faixa2')/div[2]/div[2]/label[3]")
	private WebElement naopossuiFgts;
	
	@FindBy(xpath ="id('faixa2')/div[2]/div[3]/label[2]")
	private WebElement possuiSaldo10Fgts;
	
	@FindBy(xpath ="id('faixa2')/div[2]/div[3]/label[3]")
	private WebElement naopossuiSaldo10Fgts;
	
	@FindBy(xpath ="id('faixa2')/div[2]/div[4]/label[2]")
	private WebElement beneficiarioFgts;
	
	@FindBy(xpath ="id('faixa2')/div[2]/div[4]/label[3]")
	private WebElement naoBeneficiarioFgts;

	@FindBy(xpath ="id('faixa2')/div[2]/div[5]/label[2]")
	private WebElement segundoComprador;
	
	@FindBy(xpath ="id('faixa2')/div[2]/div[5]/label[3]")
	private WebElement unicoComprador;
	
	@FindBy(xpath ="id('faixa2')/div[2]/div[6]/label[2]")
	private WebElement ultilizaPmcmv;
	
	@FindBy(xpath ="id('faixa2')/div[2]/div[6]/label[3]")
	private WebElement naoUltilizaPmcmv;
	
	@FindBy(xpath ="id('formulario:rendaFamiliarBruta')")
	private WebElement rendaBruta;
	
	@FindBy(xpath ="id('btnSeusDados')")
	private WebElement btnSeusDados;
	
	@FindBy(xpath ="id('formulario:valorFinanciamento')")
	private WebElement valorFinanciamento;
	
	@FindBy(xpath ="id('formulario:prazoFinanciamento')")
	private WebElement prazoFinanciamento;
	
	@FindBy(xpath ="id('formulario:btnValoresFinanciamento')")
	private WebElement btnValorFinanciamento;
	
	@FindBy(xpath ="//*[@id='formulario:controlaExibicaoCampos']/div[3]/div/div/table/tbody/tr[1]/td[2]/input")
	private WebElement taxaBalcao;
	
	@FindBy(xpath ="//*[@id='formulario:idMessageslinhas']")
	private WebElement btnSeleciona;
	

	public WebElement getResidencial() {
		return residencial;
	}

	public WebElement getComercial() {
		return comercial;
	}

	public WebElement getNovo() {
		return novo;
	}

	public WebElement getUsado() {
		return usado;
	}

	public WebElement getFinanciadoBb() {
		return financiadoBb;
	}

	public WebElement getNaoFinanciadoBb() {
		return naoFinanciadoBb;
	}

	public WebElement getUf() {
		return uf;
	}
	
	public WebElement getSearchUf() {
		return searchUf;
	}
	

	public WebElement getCidade() {
		return cidade;
	}
	
	public WebElement getSearchCidade() {
		return searchCidade;
	}
	
	public WebElement getPossuiImovel() {
		return possuiImovel;
	}

	public WebElement getNaopossuiImovel() {
		return naopossuiImovel;
	}

	public WebElement getValorImovel() {
		return valorImovel;
	}

	public WebElement getBtnContinuar() {
		return btnContinuar;
	}

	public WebElement getCpf() {
		return cpf;
	}

	public WebElement getDataNascimento() {
		return dataNascimento;
	}

	public WebElement getPossuiFgts() {
		return possuiFgts;
	}

	public WebElement getNaopossuiFgts() {
		return naopossuiFgts;
	}

	public WebElement getPossuiSaldo10Fgts() {
		return possuiSaldo10Fgts;
	}

	public WebElement getNaopossuiSaldo10Fgts() {
		return naopossuiSaldo10Fgts;
	}

	public WebElement getBeneficiarioFgts() {
		return beneficiarioFgts;
	}

	public WebElement getNaoBeneficiarioFgts() {
		return naoBeneficiarioFgts;
	}

	public WebElement getSegundoComprador() {
		return segundoComprador;
	}

	public WebElement getUnicoComprador() {
		return unicoComprador;
	}

	public WebElement getUltilizaPmcmv() {
		return ultilizaPmcmv;
	}

	public WebElement getNaoUltilizaPmcmv() {
		return naoUltilizaPmcmv;
	}

	public WebElement getRendaBruta() {
		return rendaBruta;
	}

	public WebElement getBtnSeusDados() {
		return btnSeusDados;
	}

	public WebElement getValorFinanciamento() {
		return valorFinanciamento;
	}

	public WebElement getPrazoFinanciamento() {
		return prazoFinanciamento;
	}

	public WebElement getBtnValorFinanciamento() {
		return btnValorFinanciamento;
	}
	
	public WebElement getTaxaBalcao() {
		return taxaBalcao;
	}
	
	public WebElement getBtnSeleciona() {
		return btnSeleciona;
	}
}
