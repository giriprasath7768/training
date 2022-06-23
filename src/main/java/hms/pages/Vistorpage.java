package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import hms.base.Testbase;
import hms.utility.Datepicker;
import hms.utility.commonutility;

public class Vistorpage extends Testbase {
	
	@FindBy(css="h3.box-title")WebElement visboxtitle;
	@FindBy(css="div.box-tools>a")WebElement Addvistor;
    @FindBy(xpath="//h4[text()=' Add Visitor']")WebElement screentitle;
    @FindBy(css="form#formadd select[name='purpose']")WebElement purpose;
	@FindBy(css="form#formadd input[name='name']")WebElement pname;
	@FindBy(css="form#formadd input[name='contact']")WebElement phno;
	@FindBy(css="form#formadd input[name='id_proof']")WebElement idpro;
	@FindBy(css="form#formadd input[name='pepples']")WebElement noper;
	@FindBy(css="form#formadd input[name='date']")WebElement datepicker;
	@FindBy(css="form#formadd textarea[name='note']")WebElement note;
	@FindBy(css="form#formadd input[name='file']")WebElement upfile;
	@FindBy(css="button.close12")WebElement btnclose;
	
	
	
	public Vistorpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getboxtitle()
	{
		
		return visboxtitle.getText();
		
	}
	
	public void clickonaddvistor()
	{
		Addvistor.click();
	}
	
	public String getscreentitle()
	{
		waitforElement(screentitle);
		return screentitle.getText();
		
	}
	
	public void addvistordetails(String data[])
	{
		Select drp=new Select(purpose);
		drp.selectByVisibleText(data[0]);
	    pname.sendKeys(data[1]);
		phno.sendKeys(data[2]);
		idpro.sendKeys(data[3]);
		noper.sendKeys(data[5]);
	    datepicker.click();
	    Datepicker dat=new Datepicker();
	    dat.datpicker(data[4]);
	    
		note.sendKeys(data[6]);
	  // upfile;
		commonutility.mousemovement(upfile);
		commonutility.fileupload(data[7]);
		btnclose.click();
	}
    
}
