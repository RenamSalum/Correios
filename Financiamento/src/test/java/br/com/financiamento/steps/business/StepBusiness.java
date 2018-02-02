package br.com.financiamento.steps.business;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import br.com.financiamento.pages.PageObjetctClass;
import io.openbdt.element.WebBrowserScreenElement;
//import jxl.common.Logger;


@ContextConfiguration("/appcontext.xml")
public class StepBusiness {
	PageObjetctClass page;
	//private static Logger LOG = Logger.getLogger(StepBusiness.class);
	
	@Autowired 
	private WebBrowserScreenElement viewElement;

	
	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}
	
	public void clicarHabitacao(){
		viewElement.clickAndWait(page.getLinkHabitacao(),15);
	}
	
	public void clicarSimulador(){
		viewElement.clickAndWait(page.getLinkSimulador(),15);
	}
	
	public void selecionaPessoa(String pessoa){
		if(pessoa.contains("Física")){
			viewElement.clickAndWait(page.getSelecaoPessoaF(),15);
		}else if(pessoa.contains("Jurídica")){
			viewElement.clickAndWait(page.getSelecaoPessoaJ(),15);	
		}else{
			}
	}
	
	
	public void tipoFinanciamento(String tipoFinanciamento){
		viewElement.clickAndWait(page.getTipoFinanciamento(),15);
		viewElement.findElement(org.openqa.selenium.By.linkText(tipoFinanciamento)).click();
	}
	
	public void categoriaImovel(String categoria){
		/*viewElement.clickAndWait(page.getCategoria(),15);
		viewElement.clear(page.getCategoria());
		viewElement.sendText(page.getCategoria(), categoria);
		viewElement.sendText(page.getCategoria(), Keys.ENTER.toString());
		*/
		viewElement.clickAndWait(page.getCategoria(),15);
		viewElement.findElement(org.openqa.selenium.By.linkText(categoria)).click();
		
	}
	
	public void valorImovel(String valor){
		viewElement.clickAndWait(page.getValorImovel(),15);
		viewElement.sendText(page.getValorImovel(), valor);
	}
	
	public void localUf(String uf){
		/*viewElement.clickAndWait(page.getUf(),15);
		viewElement.clear(page.getUf());
		viewElement.sendText(page.getUf(), uf);
		viewElement.sendText(page.getUf(), Keys.ENTER.toString());*/
		
		viewElement.clickAndWait(page.getUf(),15);
		viewElement.findElement(org.openqa.selenium.By.linkText(uf)).click();
		
	}
	
	public void localImovel(String cidade){
		viewElement.clickAndWait(page.getCidade(),15);
		viewElement.clear(page.getCidade());
		viewElement.sendText(page.getCidade(), cidade);
		viewElement.sendText(page.getCidade(), Keys.ENTER.toString());
	}

	
	public void clicarProximaEtapa(){
		viewElement.clickAndWait(page.getProximaEtapa(),15);
	}
	
	public void cpf(String cpf){
		viewElement.clear(page.getCpf());
		viewElement.sendText(page.getCpf(), cpf);
		viewElement.sendText(page.getCpf(), Keys.ENTER.toString());
	}
	
	public void numeroCelular(String celular){
		viewElement.clickAndWait(page.getNumeroCelular(),15);
		viewElement.clear(page.getNumeroCelular());
		viewElement.sendText(page.getNumeroCelular(), celular);
		viewElement.sendText(page.getNumeroCelular(), Keys.ENTER.toString());
	}
	
	public void rendaBrutaMensal(String renda){
		viewElement.clickAndWait(page.getRendaBrutaFamailiar(),15);
		viewElement.clear(page.getRendaBrutaFamailiar());
		viewElement.sendText(page.getRendaBrutaFamailiar(), renda);
		viewElement.sendText(page.getRendaBrutaFamailiar(), Keys.ENTER.toString());
	}

	public void dataNascimento(String data){
		viewElement.clickAndWait(page.getDataNascimento(),15);
		viewElement.sendText(page.getDataNascimento(), data);
		viewElement.click(page.getDataNascimentobtn());
		
	}
	
	public void clicarProximaEtapa2(){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		this.viewElement.clickAndWait(page.getProximaEtapa2(), 30);

	}
	
	public void clicarTaxabalcao() throws InterruptedException{
		viewElement.click(page.getTaxaBalcao());
		Thread.sleep(10000);
		
	}
	
	public void validarFinanciamento(){
	
	}
	
	
	
}