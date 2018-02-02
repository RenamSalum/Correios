package br.com.financiamento.BB.steps.business;


import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import br.com.financiamento.BB.pages.PageObjectClass;
import io.openbdt.element.WebBrowserScreenElement;



@ContextConfiguration("/appcontext.xml")
public class StepBusiness {
	PageObjectClass page;
	//private static Logger LOG = Logger.getLogger(StepBusiness.class);
	
	@Autowired 
	private WebBrowserScreenElement viewElement;

	
	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}
	
	public void tipoImovel(String tipoFinanciamento){
		if(tipoFinanciamento.contains("Residencial")){
			viewElement.click(page.getResidencial());
		}else if(tipoFinanciamento.contains("Comercial")){
			viewElement.click(page.getComercial());	
		}else{}
	}
	
	public void categoriaImovel (String categoriaImovel){
		if(categoriaImovel.contains("Novo")){
			viewElement.clickAndWait(page.getNovo(),15);
		}else if(categoriaImovel.contains("Usado")){
			viewElement.clickAndWait(page.getUsado(),15);	
		}else{}
	}
	
	public void empreendimentoBB (String empreendimentoBB){
		if(empreendimentoBB.contains("Sim")){
			viewElement.clickAndWait(page.getFinanciadoBb(),15);
		}else if(empreendimentoBB.contains("Não")){
			viewElement.clickAndWait(page.getNaoFinanciadoBb(),15);	
		}else{}
	}
	
	public void uf(String uf) throws InterruptedException {
		viewElement.clickAndWait(page.getUf(),15);
		viewElement.sendText(page.getSearchUf(), uf);
		viewElement.sendText(page.getSearchUf(), Keys.ENTER.toString());
		Thread.sleep(1000);
	}
	
	public void localImovel(String cidade){
		viewElement.clickAndWait(page.getCidade(),15);
		viewElement.sendText(page.getSearchCidade(), cidade);
		viewElement.sendText(page.getSearchCidade(), Keys.ENTER.toString());
	}
	
	public void possuiImovel (String possuiImovel){
		if(possuiImovel.contains("Sim")){
			viewElement.click(page.getPossuiImovel());
		}else if(possuiImovel.contains("Não")){
			viewElement.click(page.getNaopossuiImovel());	
		}else{;}
	}
	
	public void valorImovel(String valorImovel){
		viewElement.clickAndWait(page.getValorImovel(),15);
		viewElement.sendText(page.getValorImovel(), valorImovel);
	}
	
	public void clicabtnContinuar(){
		viewElement.clickAndWait(page.getBtnContinuar(),15);
	}
	
	public void dataNascimento(String data){
		viewElement.clickAndWait(page.getDataNascimento(),15);
		viewElement.sendText(page.getDataNascimento(), data);
		viewElement.sendText(page.getDataNascimento(), Keys.ENTER.toString());
		clicaBtnSeusDados();
	}
	
	public void cpf(String cpf){
		viewElement.clear(page.getCpf());
		viewElement.sendText(page.getCpf(), cpf);
		viewElement.sendText(page.getCpf(), Keys.ENTER.toString());
	}
	

	public void possuiFgtsMaiorTresAnos (String fgtsMaiorTres){
		if(fgtsMaiorTres.contains("Sim")){
			viewElement.clickAndWait(page.getPossuiFgts(),15);
		}else if(fgtsMaiorTres.contains("Não")){
			viewElement.clickAndWait(page.getNaopossuiFgts(),15);	
		}else{}
	}
	
	public void possuiFgtsMaiorDezAnos (String fgtsMaiorDez){
		if(fgtsMaiorDez.contains("Sim")){
			viewElement.clickAndWait(page.getPossuiSaldo10Fgts(),15);
		}else if(fgtsMaiorDez.contains("Não")){
			viewElement.clickAndWait(page.getNaopossuiSaldo10Fgts(),15);	
		}else{}
	}
	
	public void beneficiarioFgts (String beneficiarioFgts){
		if(beneficiarioFgts.contains("Sim")){
			viewElement.clickAndWait(page.getBeneficiarioFgts(),15);
		}else if(beneficiarioFgts.contains("Não")){
			viewElement.clickAndWait(page.getNaoBeneficiarioFgts(),15);	
		}else{}
	}
	
	public void segundoComprador (String segundoComprador){
		if(segundoComprador.contains("Sim")){
			viewElement.clickAndWait(page.getSegundoComprador(),15);
		}else if(segundoComprador.contains("Não")){
			viewElement.clickAndWait(page.getUnicoComprador(),15);	
		}else{}
	}
	
	public void legislacaoPmcmv (String pmcmv){
		if(pmcmv.contains("Sim")){
			viewElement.clickAndWait(page.getUltilizaPmcmv(),15);
		}else if(pmcmv.contains("Não")){
			viewElement.clickAndWait(page.getNaoUltilizaPmcmv(),15);	
		}else{}
	}
	
	public void rendaBrutaMensal(String renda){
		viewElement.clickAndWait(page.getRendaBruta(),15);
		viewElement.clear(page.getRendaBruta());
		viewElement.sendText(page.getRendaBruta(), renda);
		viewElement.sendText(page.getRendaBruta(), Keys.ENTER.toString());
	}

	public void clicaBtnSeusDados(){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		viewElement.clickAndWait(page.getBtnSeusDados(), 30);
		
	}
	
	public void valorFinanciamento(String valorFinancioamento){
		viewElement.clickAndWait(page.getValorFinanciamento(),15);
		viewElement.sendText(page.getValorFinanciamento(), valorFinancioamento);
		viewElement.sendText(page.getValorFinanciamento(), Keys.ENTER.toString());
	}
	
	public void ParcelasFinanciamento(String prazoFinanciamento){
		viewElement.clickAndWait(page.getPrazoFinanciamento(),15);
		viewElement.clear(page.getPrazoFinanciamento());
		viewElement.sendText(page.getPrazoFinanciamento(), prazoFinanciamento);
		viewElement.sendText(page.getPrazoFinanciamento(), Keys.ENTER.toString());
	}
	
	public void clicaBtnValorFinanciamento() throws InterruptedException{
		viewElement.click(page.getBtnValorFinanciamento());
		Thread.sleep(10000);
		
	}
	
	public void selecionaTaxaBalcao(){
		viewElement.click(page.getTaxaBalcao());
		
	}
	
	public void clicaBtnSeleciona() throws InterruptedException{
		viewElement.click(page.getBtnSeleciona());
		Thread.sleep(30000);
		
	}
	
}