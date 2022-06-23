package hms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hms.base.Testbase;

public class Loginpage extends Testbase {
	
  @FindBy(tagName ="img")WebElement logo;
  @FindBy(css="h3.font-white")WebElement logintxt;
  @FindBy(css="input#email")WebElement usertxt;
  @FindBy(css="input#password")WebElement passtxt;
  @FindBy(css="button.btn")WebElement signin;
  @FindBy(css="img.topuser-image")WebElement proicon;
  @FindBy(xpath="//h5[text()='Super Admin']")WebElement protxt;
  @FindBy(css="div.sspass>a:nth-child(3)")WebElement logout;
  

  public Loginpage()
  {
	  PageFactory.initElements(driver, this);
  }
  
  
  public String getpagetitle()
  {
	return driver.getTitle();
	  
  }
  
  public boolean logodisplayed()
  {
	return logo.isDisplayed();
	  
  }
  
  public String getlogintitle()
  {
	return logintxt.getText();
	  
  }
  
  public FrontofficePage adminlogin(String uname,String upass)
  {
	  usertxt.sendKeys(uname);
	  passtxt.sendKeys(upass);
	  signin.click();
	return new FrontofficePage();
  }
  
  public void clickonprofile()
  {
	  proicon.click();
  }
  public String getprofiletext()
  {
	  return protxt.getText();
  }
  
  public void clickonlogout()
  {
	  logout.click();
  }
  
}
