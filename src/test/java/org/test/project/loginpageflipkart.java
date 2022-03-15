package org.test.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageflipkart extends BaseClass{
	
	public loginpageflipkart() {
		PageFactory.initElements(driver, this);
	}
@CacheLookup

@FindBy(xpath="//input[@class='_3704LK']")
private WebElement producttext;

	
@FindBy(xpath="//div[@class='_4rR01T']")
private WebElement productsearch;

	
	
@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
private WebElement hightolow;


@FindBy(xpath="//span[@class='_10Ermr']")
private WebElement productnumbers;
	
@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1'][1]")
private WebElement highest;


@FindBy(xpath="//div[@class='_10UF8M']")
private WebElement lowtohigh;

	
	
@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1'][1]")
private WebElement lowestprice;


public void clear() {
	hightolow.clear();
}



public void click() {
	hightolow.click();
}



public WebElement findElement(By arg0) {
	return hightolow.findElement(arg0);
}



public List<WebElement> findElements(By arg0) {
	return hightolow.findElements(arg0);
}



public String getAttribute(String arg0) {
	return hightolow.getAttribute(arg0);
}



public String getCssValue(String arg0) {
	return hightolow.getCssValue(arg0);
}



public Point getLocation() {
	return hightolow.getLocation();
}



public Rectangle getRect() {
	return hightolow.getRect();
}



public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
	return hightolow.getScreenshotAs(arg0);
}



public Dimension getSize() {
	return hightolow.getSize();
}



public String getTagName() {
	return hightolow.getTagName();
}



public String getText() {
	return hightolow.getText();
}



public boolean isDisplayed() {
	return hightolow.isDisplayed();
}



public boolean isEnabled() {
	return hightolow.isEnabled();
}



public boolean isSelected() {
	return hightolow.isSelected();
}



public void sendKeys(CharSequence... arg0) {
	hightolow.sendKeys(arg0);
}



public void submit() {
	hightolow.submit();
}



public WebElement getHighest() {
	return highest;
}



public void setHighest(WebElement highest) {
	this.highest = highest;
}



public void setProducttext(WebElement producttext) {
	this.producttext = producttext;
}



public void setProductsearch(WebElement productsearch) {
	this.productsearch = productsearch;
}



public void setHightolow(WebElement hightolow) {
	this.hightolow = hightolow;
}



public void setProductnumbers(WebElement productnumbers) {
	this.productnumbers = productnumbers;
}



public void setLowtohigh(WebElement lowtohigh) {
	this.lowtohigh = lowtohigh;
}



public void setLowestprice(WebElement lowestprice) {
	this.lowestprice = lowestprice;
}



public void setLogin(WebElement login) {
	this.login = login;
}

	
	
	
	public WebElement getProducttext() {
	return producttext;
}



public WebElement getProductsearch() {
	return productsearch;
}



public WebElement getHightolow() {
	return hightolow;
}



public WebElement getProductnumbers() {
	return productnumbers;
}





public WebElement getLowtohigh() {
	return lowtohigh;
}



public WebElement getLowestprice() {
	return lowestprice;
}



public WebElement getLogin() {
	return login;
}
	@FindBy (name ="login")
	private WebElement login;



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
