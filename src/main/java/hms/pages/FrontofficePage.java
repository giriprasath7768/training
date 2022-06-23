package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.base.Testbase;

public class FrontofficePage extends Testbase {
	
	@FindBy(css="ul.sidebar-menu>li")WebElement frontmenu;
	@FindBy(css="h3.box-title.titlefix")WebElement fftabletitle;
	@FindBy(css="div.box-tools>a:nth-child(2)")WebElement vistorbook;
	
	public FrontofficePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonffmenu()
	{
		frontmenu.click();	
	}
	
	public String getboxtitle()
	{
		return fftabletitle.getText();
		
	}
	public Vistorpage clickonvistorbook()
	{
		vistorbook.click();
		return new Vistorpage();
	}

}
