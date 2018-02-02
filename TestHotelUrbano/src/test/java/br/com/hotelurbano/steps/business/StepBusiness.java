package br.com.hotelurbano.steps.business;

import static org.awaitility.Awaitility.await;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.gargoylesoftware.htmlunit.html.HtmlTextArea;

import br.com.hotelurbano.pages.PageObjetctClass;
import io.openbdt.element.WebBrowserScreenElement;
import java.util.Random;

@ContextConfiguration("/appcontext.xml")
public class StepBusiness {
	

	PageObjetctClass pages;
	
	private ArrayList<String> cep = new ArrayList();
	
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
	
	public int random(){

		Random gerador = new Random();
	    return gerador.nextInt(4);
	}
	
	public void abrirBrowser(String url){
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
		
	}
	
	
	
	public void clicarBtnHoteis(){
		viewElement.clickAndWait(pages.getBtnHoteis(), 15);
		
	}
	
	public void preencherCampoPesquisar(String campoPesquisar){
		viewElement.click(pages.getCampoPesquisar());
		viewElement.sendText(pages.getCampoPesquisar(), campoPesquisar);
    }
	
	public void clicarBtnBuscar() throws Throwable{
		viewElement.clickAndWait(pages.getBtnBuscar(), 15);
		
	
	}
	
	public void clicarChkBoxCincoEstrelas() throws InterruptedException{
		viewElement.clickAndWait(pages.getChkBoxCincoEstrelas(), 30);
		Thread.sleep(10000);
		
	}

	public void selecionaHotel() throws Throwable{
		int r = random();
		//String link;
		viewElement.clickAndWait(pages.getComponentCardDois(), 30);

		/* quando div esta bloqueada para click
		if(r == 0){
			link = viewElement.findElement(By.xpath("//*[@id='result-card']/div[1]/div/a")).getAttribute("href");
			System.out.println(link);
			viewElement.navigate(link);	
		}else if(r == 1){	
			link = viewElement.findElement(By.xpath("//*[@id='result-card']/div[2]/div/a")).getAttribute("href");
			System.out.println(link);
			viewElement.navigate(link);	
		}else if(r == 2){
			link = viewElement.findElement(By.xpath("//*[@id='result-card']/div[3]/div/a")).getAttribute("href");
			System.out.println(link);
			viewElement.navigate(link);	
		}else{
			link = viewElement.findElement(By.xpath("//*[@id='result-card']/div[4]/div/a")).getAttribute("href");
			System.out.println(link);
			viewElement.navigate(link);	
		}*/
		
	}
	

	public void resultado() throws Throwable{
		await().atMost(30, TimeUnit.SECONDS);
	}
	
		
	public void clicarBtnAerios(){
		viewElement.clickAndWait(pages.getBtnAerios(), 15);
		
	}
		

	public void preencherCampoIda(String campoIda) throws Throwable{
		/*
		viewElement.click(pages.getCampoIda2());
		viewElement.clear(pages.getCampoIda());
		viewElement.sendText(pages.getCampoIda(), "Rio de Janeiro");
		Thread.sleep(1000);
		viewElement.sendText(pages.getCampoIda(), Keys.ENTER.toString());	
		*/
		viewElement.click(viewElement.findElement(By.xpath("//*[@id='search']/div[1]/div[3]")));
		viewElement.clear(viewElement.findElement(By.xpath("id('search')/div[1]/div[3]/div/div/div/input")));
		viewElement.sendText(viewElement.findElement(By.xpath("id('search')/div[1]/div[3]/div/div/div/input")), "Rio de Janeiro");
		Thread.sleep(1000);
		viewElement.sendText(viewElement.findElement(By.xpath("id('search')/div[1]/div[3]/div/div/div/input")), Keys.ENTER.toString());
		
    }
	
	public void preencherCampoVolta(String campoVolta) throws Throwable{
		viewElement.clickAndWait(pages.getCampoVolta2(),15);
		viewElement.sendText(pages.getCampoVolta(), campoVolta);
		Thread.sleep(1000);
		viewElement.sendText(pages.getCampoVolta(), Keys.ENTER.toString());

    }
	
	
	public void preencherData(String campoVolta) throws Throwable{
		String dia = "15";
		;int t1;
		viewElement.clickAndWait(pages.getBtnDataIda(),15);
		viewElement.findElement(By.xpath("//*[@id='date-depart_root']/div/div/div/div/div[1]")).click();
		Point t = viewElement.findElement(By.xpath("id('date-depart_root')/div/div/div/div//*[contains((@AN(),'15')]")).getLocation();
     	//t1 = viewElement.findElement(By.xpath("id('date-depart_root')/div/div/div/div//*[contains(text(),'"+ dia +"')]")).getLocation().getY();
	    Robot robot = new Robot();
        Thread.sleep(1000);
        System.out.println(t);
        //System.out.println(t1);
        
       /* robot.mouseMove(t.getX(), t.getY());
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.mouseMove(t.getX(), t.getY());
        Thread.sleep(1000);*/

		//findElement(By.xpath("//*[@id='date-depart_table']/tbody/tr/td/div"))

		/*viewElement.sendText(pages.getCampoVolta(), campoVolta);
		Thread.sleep(1000);
		viewElement.sendText(pages.getCampoVolta(), Keys.ENTER.toString());
*/
    }
	
	
	
	
}