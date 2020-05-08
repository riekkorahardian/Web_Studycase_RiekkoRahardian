package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModifiersPage {

  public String generateModifiers = "";
  public String generatedPrice = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/modifier");
  }

  public void clickCreateModifier(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Modifier')]")).click();
  }

  public void inputModifierName(){
    generateModifiers = RandomUtils.generateRandomModifierName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(generateModifiers);
  }

  public void clickAddorManageItem(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
  }

  public void clickAddOption(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Add Options')]")).click();
  }

  public void inputOptionName(String nama){
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-6']//input[@placeholder='Name']")).
            sendKeys(nama);
  }

  public void inputOptionPrice(){
    generatedPrice = RandomUtils.generateRandomItemPrice();
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='modal-body _1GWglvBwq-NTEQ_Sk12yfr']//div[2]//div[2]//div[1]//input[1]")).
            sendKeys(generatedPrice);
  }

  public void clickSaveOption(){
    WebDriverInstance.webDriver.findElement(By.xpath
            ("//div[@class='modal-footer']//button[@class='btn btn-primary'][contains(text(),'Save')]")).click();
  }

  public void clickSaveModifier(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
  }

  public boolean validateModifier(){
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 10);
    return wait.until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'"+generateModifiers+"')]")))
            .isDisplayed();
  }
  }

