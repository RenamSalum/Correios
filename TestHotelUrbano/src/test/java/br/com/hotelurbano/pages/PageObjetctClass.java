package br.com.hotelurbano.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjetctClass extends PageObject{

	@FindBy(xpath = "id('reactRoot')/div[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/nav[1]/a[2]")
	private WebElement btnHoteis;
	                 
	@FindBy(id = "huSearchComponentAutocomplete")
	private WebElement campoPesquisar;
	
	@FindBy(xpath = "id('hu-search-checkin')")
	private WebElement campoEntrada;
	
	@FindBy(xpath = "id('hu-search-checkout')")
	private WebElement campoSaida;
	
	@FindBy(xpath = "id('get-intent-midia')/div[1]/form[1]/div[2]/div[2]/button[1]")
	private WebElement btnBuscar;
	
	@FindBy(xpath = "id('filters')/aside[1]/div[2]/div[2]/div[2]/label[1]/small[1]")
	private WebElement chkBoxCincoEstrelas;
	              
	
	@FindBy(xpath = "//*[@id='result-card']/div[1]/div/a")
	private String componentCardZero;
	
	@FindBy(xpath = "//*[@id='result-card']/div[2]/div/a")
	private String componentCardUm;
	
	@FindBy(xpath = "//*[@id='result-card']/div[3]/div/a")
	private WebElement componentCardDois;
	
	@FindBy(xpath = "//*[@id='result-card']/div[4]/div/a")
	private String componentCardTres;
	

	@FindBy(xpath = "id('reactRoot')/div/div/div/div/div/header[1]/div[1]/div[2]/nav[1]/a[6]")
	private WebElement btnAerios;
	
	@FindBy(xpath = "//*[@id='search']/div[1]/div[4]/div/div/div/input")
	private WebElement campoVolta;
	
	@FindBy(xpath = "id('search')/div[1]/div[4]")
	private WebElement campoVolta2;


	@FindBy(xpath = "id('search')/div[1]/div[3]/div/div/div/input")
	private WebElement campoIda;
	
	@FindBy(xpath = "//*[@id='search']/div[1]/div[3]")
	private WebElement campoIda2;
	
	@FindBy(xpath = "id('search-date-depart')/div[1]/button[1]")
	private WebElement BtnDataIda;

	@FindBy(xpath = "id('search-date-return')/div[1]/button[1]")
	private WebElement BtnDataVolta;

	@FindBy(xpath = "id('service-class')/div[1]/button[1]/div[1]")
	private WebElement campoTipoPassagem;

	@FindBy(xpath = "id('search')/a[1]")
	private WebElement BtnBusca;
	
	
	public WebElement getCampoVolta2() {
		return campoVolta2;
	}
	
	public WebElement getCampoIda2() {
		return campoIda2;
	}
	
	
	public WebElement getBtnAerios() {
		return btnAerios;
	}

		
	public WebElement getCampoVolta() {
		return campoVolta;
	}

	public WebElement getCampoIda() {
		return campoIda;
	}

	public WebElement getBtnDataIda() {
		return BtnDataIda;
	}

	public WebElement getBtnDataVolta() {
		return BtnDataVolta;
	}

	public WebElement getCampoTipoPassagem() {
		return campoTipoPassagem;
	}

	public WebElement getBtnBusca() {
		return BtnBusca;
	}

	public WebElement getBtnHoteis() {
		return btnHoteis;
	}

	public WebElement getCampoPesquisar() {
		return campoPesquisar;
	}

	public WebElement getCampoEntrada() {
		return campoEntrada;
	}

	public WebElement getCampoSaida() {
		return campoSaida;
	}

	public WebElement getBtnBuscar() {
		return btnBuscar;
	}

	public WebElement getChkBoxCincoEstrelas() {
		return chkBoxCincoEstrelas;
	}

	public String getComponentCardZero() {
		return componentCardZero;
	}
	

	public String getComponentCardUm() {
		return componentCardUm;
	}

	public WebElement getComponentCardDois() {
		return componentCardDois;
	}

	public String getComponentCardTres() {
		return componentCardTres;
	}
	
	
}
