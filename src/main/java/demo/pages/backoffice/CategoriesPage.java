package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {

  public String getRandomName = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/categories");
  }

  public void clickCreateCategory(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Category')]")).click();
  }

  public void inputCategoryName(){
    getRandomName = RandomUtils.generateRandomCategoryName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Category Name']")).sendKeys(getRandomName);
  }

  public void clickSave(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary PhtzjEWwHfB2xdkEDI8ca']")).click();
  }

  public boolean ValidateCreateItem(){
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 10);
    return wait.until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'"+getRandomName+"')]")))
            .isDisplayed();
  }

  public void checkSearch(){
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(getRandomName);
  }

  public Boolean validatecheckSearch(){
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 10);
    return wait.until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'"+getRandomName+"')]")))
            .isDisplayed();

  }
}
