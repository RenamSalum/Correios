package br.com.correios.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjetctClass extends PageObject{

	@FindBy(xpath = "//*[@id=\'content-principais-servicos\']/ul/li[1]/a/img")
	private WebElement btnBuscaCepEnd;
	                 
	@FindBy(xpath = "//*[@id=\'Geral\']/div/div/span[2]/label/input")
	private WebElement campoBusca;
	
	@FindBy(xpath = "//*[@id=\'Geral\']/div/div/span[3]/label/select")
	private WebElement campoCepDe;
	
	@FindBy(xpath = "//*[@id=\'Geral\']/div/div/div[6]/input")
	private WebElement BtnBuscar;
	
	@FindBy(xpath = "//*[@id='content-principais-servicos']/ul/li[3]/a/img")
	private WebElement btnBuscaPrecoPrazos;
	
	@FindBy(xpath = "//*[@id='data']")
	private WebElement campoDataPostagem;
	
	@FindBy(name = "cepOrigem")
	private WebElement campoOrigem;
	
	@FindBy(name = "cepDestino")
	private WebElement campoDestino;
	
	@FindBy(name = "servico")
	private WebElement campoTipoServico;
	
	@FindBy(xpath = "id('spanFormato')/img[1]")
	private WebElement formatoCaixa;
	
	@FindBy(name = "embalagem1")
	private WebElement campoEmbalagem;
	
	@FindBy(name = "Altura")
	private WebElement dimensaoAltura;
	
	@FindBy(name = "Largura")
	private WebElement dimensaoLargura;
	
	@FindBy(name = "Comprimento")
	private WebElement dimensaoComprimento;
	
	@FindBy(name = "peso")
	private WebElement campoPeso;
	
	@FindBy(name = "avisoRecebimento")
	private WebElement ckboxAvisoRecebimento;
	
	@FindBy(name = "Calcular")
	private WebElement btnEnviar;
	
	@FindBy(xpath = "//*[@id='content-principais-servicos']/ul/li[4]/a/img")
	private WebElement btnRedeAtendimento;
	
	@FindBy(xpath = "id('formBuscaAgencia')/div[1]/div[1]/div[1]/span[2]/label[1]")
	private WebElement chkboxTipoBusca;
	
	@FindBy(xpath = "id('estadoAgencia')")
	private WebElement campoEstado;
	
	@FindBy(xpath = "id('municipioAgencia')")
	private WebElement campoMunicipio;
	
	@FindBy(xpath = "id('bairroAgencia')")
	private WebElement campoBairro;
	
	@FindBy(id = "divDetalheAgencia")
	private WebElement btnDetalheAgencia;
	
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[4]")
	private WebElement tabelaCep;
	                 
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]/a")
	private WebElement btnNovaConsulta;
	
	public WebElement getBtnNovaConsulta() {
		return btnNovaConsulta;
	}

	public WebElement getTabelaCep() {
		return tabelaCep;
	}
	
	public WebElement getBtnRedeAtendimento() {
		return btnRedeAtendimento;
	}


	public WebElement getChkboxTipoBusca() {
		return chkboxTipoBusca;
	}


	public WebElement getCampoEstado() {
		return campoEstado;
	}


	public WebElement getCampoMunicipio() {
		return campoMunicipio;
	}


	public WebElement getCampoBairro() {
		return campoBairro;
	}


	public WebElement getBtnDetalheAgencia() {
		return btnDetalheAgencia;
	}


	public WebElement getFormatoCaixa() {
		return formatoCaixa;
	}


	public WebElement getCampoEmbalagem() {
		return campoEmbalagem;
	}


	public WebElement getDimensaoAltura() {
		return dimensaoAltura;
	}


	public WebElement getDimensaoLargura() {
		return dimensaoLargura;
	}


	public WebElement getDimensaoComprimento() {
		return dimensaoComprimento;
	}


	public WebElement getCampoPeso() {
		return campoPeso;
	}


	public WebElement getCkboxAvisoRecebimento() {
		return ckboxAvisoRecebimento;
	}


	public WebElement getBtnEnviar() {
		return btnEnviar;
	}


	public WebElement getBtnBuscaPrecoPrazos() {
		return btnBuscaPrecoPrazos;
	}


	public WebElement getCampoDataPostagem() {
		return campoDataPostagem;
	}


	public WebElement getCampoOrigem() {
		return campoOrigem;
	}


	public WebElement getCampoDestino() {
		return campoDestino;
	}


	public WebElement getCampoTipoServico() {
		return campoTipoServico;
	}

	
	public WebElement getCampoBusca() {
		return campoBusca;
	}


	public WebElement getCampoCepDe() {
		return campoCepDe;
	}


	public WebElement getBtnBuscaCepEnd() {
		return btnBuscaCepEnd;
	}


	public WebElement getBtnBuscar() {
		return BtnBuscar;
	}
	




}
