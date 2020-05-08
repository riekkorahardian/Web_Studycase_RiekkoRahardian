package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.WebDriverInstance.getWebDriver;

public class ItemLibraryPage {

  public String generatedItemName = " ";
  public String generatedPrice = "";
  public String generatedSKU = "";
  public String generatedText = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/list");
  }

  public void waitAbit(int millis){
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void clickCreateItem(){
    waitAbit(5000);
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Item')]")).click();
  }

  public void inputItemName(){
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Item Name']")).sendKeys(generatedItemName);
  }

  public void clickCategorized(String Keyword){
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='Select-value']")).click();
  }

  public void addVariant(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block no-border-radius-top']"))
            .click();
  }

  public void addVariantName(String Keyword){
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(Keyword);
  }

  public void inputPrice(){
    generatedPrice = RandomUtils.generateRandomItemPrice();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Rp. 0']")).sendKeys(generatedPrice);
  }
  public void inputSKU(){
    generatedSKU = RandomUtils.generateRandomSKU();
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-4']//div//input[@placeholder='SKU']")).sendKeys(generatedSKU);
  }

  public void clickConfirmAddVariant(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
  }

  public void addModifier(String modifierName){
    waitAbit(1000);
    WebElement modifier = getWebDriver()
            .findElement(By.xpath("//label[text()='"+modifierName+"']/parent::div/input"));
    JavascriptExecutor js = (JavascriptExecutor) WebDriverInstance.webDriver;
    js.executeScript("arguments[0].scrollIntoView();",modifier);
    modifier.click();
  }

  public void addItemDescription(){
    generatedText = RandomUtils.generatedText();
    WebDriverInstance.webDriver.findElement(By.xpath("//textarea[@placeholder='Item Description']")).sendKeys(generatedText);
  }

  public void clickSaveItem(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary no-outline']")).click();
  }

  public boolean validateItemLibrary(){
      WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 10);
      return wait.until(
              ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'"+generatedItemName+"')]")))
              .isDisplayed();
    }
  }


