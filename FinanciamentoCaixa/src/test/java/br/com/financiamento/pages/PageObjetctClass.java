package br.com.financiamento.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjetctClass extends PageObject{

	@FindBy(xpath ="//*[@id='content-menu']/ul/li[5]/a")
	private WebElement linkHabitacao;	
	
	@FindBy(xpath ="//*[@id='itemCinco']/article/div/div[2]/ul/li[4]/a/span[1]")
	private WebElement linkSimulador;
	
	@FindBy(xpath ="id('pessoaF')")
	private WebElement selecaoPessoaF;
	
	@FindBy(xpath ="id('pessoaJ')")
	private WebElement selecaoPessoaJ;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/form[1]/div[1]/fieldset[1]/ul[1]/li[2]/button[1]/span[1]")
	private WebElement tipoFinanciamentoBtn;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/form[1]/div[1]/fieldset[1]/ul[1]/li[3]/button[1]")
	private WebElement categoria;
	
	@FindBy(xpath ="//*[@id='valorImovel']")
	private WebElement valorImovel;
	
	@FindBy(xpath ="id('div_uf')/button[1]/span[1]")
	private WebElement uf;
	
	@FindBy(xpath ="id('cidade_input')")
	private WebElement cidade;
	
	@FindBy(xpath ="//*[@id='btn_next1']")
	private WebElement proximaEtapa;
	
	@FindBy(xpath ="//*[@id='nuCpfCnpjInteressado']")
	private WebElement cpf;
	
	@FindBy(xpath ="//*[@id='nuTelefoneCelular']")
	private WebElement numeroCelular;
	
	@FindBy(xpath ="//*[@id='rendaFamiliarBruta']")
	private WebElement rendaBrutaFamiliar;
	
	@FindBy(xpath ="//*[@id='dataNascimento']")
	private WebElement dataNascimento;
	
	@FindBy(xpath ="/html/body/div[1]/form/div/fieldset[2]/ul/li[4]/div/button")
	private WebElement dataNascimentobtn;
	
	@FindBy(xpath ="id('btn_next2')")
	private WebElement proximaEtapa2;
	
	@FindBy(xpath ="//*[@id='passo3']/ul/li[1]/ul/li/label/a")
	private WebElement taxaBalcao;
	
	@FindBy(xpath ="//*[@id='resultadoSimulacao']/div/div[1]/div[1]/table/tbody/tr[1]/td[2]")
	private WebElement imovel;

	
	
	public WebElement getLinkHabitacao() {
		return linkHabitacao;
	}

	public WebElement getLinkSimulador() {
		return linkSimulador;
	}

	public WebElement getSelecaoPessoaF() {
		return selecaoPessoaF;
	}
	
	public WebElement getSelecaoPessoaJ() {
		return selecaoPessoaJ;
	}

	public WebElement getTipoFinanciamento() {
		return tipoFinanciamentoBtn;
	}

	public WebElement getCategoria() {
		return categoria;
	}

	public WebElement getValorImovel() {
		return valorImovel;
	}

	public WebElement getUf() {
		return uf;
	}

	public WebElement getCidade() {
		return cidade;
	}

	public WebElement getProximaEtapa() {
		return proximaEtapa;
	}

	public WebElement getCpf() {
		return cpf;
	}

	public WebElement getNumeroCelular() {
		return numeroCelular;
	}

	public WebElement getRendaBrutaFamailiar() {
		return rendaBrutaFamiliar;
	}

	public WebElement getDataNascimento() {
		return dataNascimento;
	}
	
	public WebElement getDataNascimentobtn() {
		return dataNascimentobtn;
	}

	public WebElement getProximaEtapa2() {
		return proximaEtapa2;
	}

	public WebElement getTaxaBalcao() {
		return taxaBalcao;
	}
	
	public WebElement getImovel() {
		return imovel;
	}
	



}
