package br.com.correios.steps.business;

import static org.awaitility.Awaitility.await;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import br.com.correios.pages.PageObjetctClass;
import io.openbdt.element.WebBrowserScreenElement;


@ContextConfiguration("/appcontext.xml")
public class StepBusiness {
	PageObjetctClass pages;
	
	private ArrayList<String> cep = new ArrayList<String>();
	//private static Logger LOG = Logger.getLogger(StepBusiness.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement;
	
	
	private String getDateTime() { 
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		Date date = new Date(); 
		//Calendar c = Calendar.getInstance();// data Futura
		//c.setTime(date);
		//c.add(Calendar.DATE, +1);
		//date = c.getTime();
		return dateFormat.format(date); 
	}
	

	
	public void abrirBrowser(String url){
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
		
	}
	
	public void clicarBtnBusca(){
		viewElement.clickAndWait(pages.getBtnBuscaCepEnd(), 15);
		
	}
	
	public void preencherCampoBusca(String campoBusca){
			viewElement.click(pages.getCampoBusca());
			viewElement.sendText(pages.getCampoBusca(), campoBusca);
	}
	
	public void preencherCampoCepDe(String campoCepDe){
			viewElement.click(pages.getCampoCepDe());
			viewElement.selectByVisibleText(pages.getCampoCepDe(), campoCepDe);
		}

	
	public void clicarBtnBuscar(){
		viewElement.clickAndWait(pages.getBtnBuscar(), 15);
		
	}
	
	public void clicarBtnBuscaPrecoPrazos(){
		viewElement.clickAndWait(pages.getBtnBuscaPrecoPrazos(), 15);
	}
	
	public void preencherCampoDataPostagem(){
		viewElement.click(pages.getCampoDataPostagem());
		viewElement.clear(pages.getCampoDataPostagem());
		viewElement.sendText(pages.getCampoDataPostagem(), getDateTime());
		//viewElement.sendText(pages.getCampoDataPostagem(), campoDataPostagem);

	}
	
	public void preencherCampoOrigem(String campoOrigem){
		viewElement.click(pages.getCampoOrigem());
		viewElement.sendText(pages.getCampoOrigem(), campoOrigem);
	}
	
	public void preencherCampoDestino(String campoDestino){
		viewElement.click(pages.getCampoDestino());
		viewElement.sendText(pages.getCampoDestino(), campoDestino);
	}
	
	public void preencherCampoTipoServico(String campoTipoServico){
		viewElement.click(pages.getCampoTipoServico());
		viewElement.selectByVisibleText(pages.getCampoTipoServico(), campoTipoServico);
	}
	
	public void SelecinarFormatoCaixa(){
		viewElement.clickAndWait(pages.getFormatoCaixa(),15);
	}
	
	public void preencherCampoEmbalagem(String campoEmbalagem){
		viewElement.click(pages.getCampoEmbalagem());
		viewElement.selectByVisibleText(pages.getCampoEmbalagem(), campoEmbalagem);
		await().atMost(10, TimeUnit.SECONDS);
		
	}
	
	public void preencherDimensaoLargura(String dimensaoLargura){
		viewElement.click(pages.getDimensaoLargura());
		viewElement.sendText(pages.getDimensaoLargura(), dimensaoLargura);
	}
	
	public void preencherDimensaoAltura(String dimensaoAltura){
		viewElement.click(pages.getDimensaoAltura());
		viewElement.sendText(pages.getDimensaoAltura(), dimensaoAltura);
	}
	
	public void preencherDimensaoComprimento(String dimensaoComprimento){
		viewElement.click(pages.getDimensaoComprimento());
		viewElement.sendText(pages.getDimensaoComprimento(), dimensaoComprimento);
	}
	
	public void preencherCampoPeso(String campoPeso){
		viewElement.click(pages.getCampoPeso());
		viewElement.selectByVisibleText(pages.getCampoPeso(), campoPeso);
	}
	
	public void SelecinarChkboxAvisoRecebimento(){
		viewElement.clickAndWait(pages.getCkboxAvisoRecebimento(),15);
	}
	
	public void clicarBtnEnviar() throws Throwable{
		viewElement.clickAndWait(pages.getBtnEnviar(), 15);
		await().atMost(org.awaitility.Duration.ONE_MINUTE);
		Thread.sleep(10000);
	}
	
	public void clicarBtnRedeAtendimento(){
		viewElement.clickAndWait(pages.getBtnRedeAtendimento(), 15);
		
	}
	
	public void selecionarChkboxTipoBusca(String chkboxTipoBusca){
		viewElement.sendText(pages.getChkboxTipoBusca(), Keys.F5.toString());
		viewElement.click(pages.getChkboxTipoBusca());

	}
	
	public void preencherCampoEstado(String campoEstado){
		viewElement.clickAndWait(pages.getCampoEstado(),15);
		viewElement.sendText(pages.getCampoEstado(), campoEstado);
		viewElement.sendText(pages.getCampoEstado(), Keys.ENTER.toString());
		
	}
	
	
	public void preencherCampoMunicipio(String campoMunicipio){
		viewElement.clickAndWait(pages.getCampoMunicipio(),15);
		viewElement.sendText(pages.getCampoMunicipio(), campoMunicipio);
		viewElement.sendText(pages.getCampoMunicipio(), Keys.ENTER.toString());
		await().atMost(10, TimeUnit.SECONDS);
	}
	
	public void preencherCampoBairro(String campoBairro){
		viewElement.clickAndWait(pages.getCampoBairro(),15);
		viewElement.sendText(pages.getCampoBairro(), campoBairro);
		viewElement.sendText(pages.getCampoBairro(), Keys.ENTER.toString());
	}
	

	public void clicarBtnDetalheAgencia(String btnDetalheAgencia){
		viewElement.findElement(By.partialLinkText(btnDetalheAgencia)).click();
	}
	
	
	public void resultado() throws Throwable{
		await().atMost(30, TimeUnit.SECONDS);
	}
	
	
	public void pegarCepNaTabela(){
		String ceps = null;
		ceps = viewElement.getText(pages.getTabelaCep());
		System.out.println(ceps+" cep 1");
		this.cep.add(ceps);
		System.out.println(this.cep.get(0) +" cep 2");
	
	}
	
	public void preencherCampoOrigem(){
		viewElement.clickAndWait(pages.getCampoOrigem(),15);
		viewElement.sendText(pages.getCampoOrigem(), this.cep.get(0));
		viewElement.sendText(pages.getCampoOrigem(), Keys.ENTER.toString());
	}
	
	public void preencherCampoDestino(){
		viewElement.clickAndWait(pages.getCampoDestino(),15);
		viewElement.sendText(pages.getCampoDestino(), this.cep.get(1));
		viewElement.sendText(pages.getCampoDestino(), Keys.ENTER.toString());
	}
	
	public void clicarBtnNovaConsulta(){
		viewElement.clickAndWait(pages.getBtnNovaConsulta(), 15);
		
	}
	
	public void NavegarPara(String url){
		viewElement.navigate(url);
	}
	
	
	
	
	
	
	
}