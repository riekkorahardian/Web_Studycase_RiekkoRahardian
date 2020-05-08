package demo.steps_definition;

import demo.pages.backoffice.CategoriesPage;
import demo.pages.backoffice.DashboardPage;
import demo.pages.backoffice.ItemLibraryPage;
import demo.pages.backoffice.LoginPage;
import demo.pages.backoffice.ModifiersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BackOfficeStepDefinitions {

  LoginPage loginPage = new LoginPage();
  DashboardPage dashboardPage = new DashboardPage();
  CategoriesPage categoriesPage = new CategoriesPage();
  ItemLibraryPage itemLibraryPage = new ItemLibraryPage();
  ModifiersPage modifiersPage = new ModifiersPage();

  @Given("User open moka backoffice login page")
  public void userOpenMokaBackofficeLoginPage() {
    loginPage.openPage();
  }

  @When("User input email/phone {string} on backoffice login page")
  public void userInputEmailOnBackofficeLoginPage(String emailOrPhone) {
    loginPage.inputEmailorPhone(emailOrPhone);
  }

  @When("User input password {string} on backoffice login page")
  public void userInputPasswordOnBackofficeLoginPage(String password) {
    loginPage.inputPassword(password);
  }

  @When("User click Sign in on backoffice login page")
  public void userClickSignInOnBackofficeLoginPage() {
    loginPage.clickSignIn();
  }


  @Then("User successfully login on backoffice")
  public void userSuccessfullyLoginOnBackoffice() {
    Assert.assertTrue(dashboardPage.isOnPage());
  }

  @When("User go to menu categories on backoffice")
  public void userGoToMenuCategoriesOnBackoffice() {
    categoriesPage.openPage();
  }


  @When("User go to menu item library on backoffice")
  public void userGoToMenuItemLibraryOnBackoffice() {
    itemLibraryPage.openPage();
  }

  @When("User go to menu modifiers on backoffice")
  public void userGoToMenuModifiersOnBackoffice() {
    modifiersPage.openPage();
  }

  @And("User click create category button on categories page")
  public void userClickCreateCategoryButtonOnCategoriesPage() {
    categoriesPage.clickCreateCategory();
  }

  @And("User input random category name on category name text field")
  public void userInputRandomCategoryNameOnCategoryNameTextField() {
    categoriesPage.inputCategoryName();
  }

  @And("User clik save buton")
  public void userClikSaveButon() {
    categoriesPage.clickSave();
  }

  @Then("User see that category has been created")
  public void userSeeThatCategoryHasBeenCreated() {
    Assert.assertTrue(categoriesPage.ValidateCreateItem());
  }

  @And("User input random category name on search text field")
  public void userInputRandomCategoryNameOnSearchTextField() {
    categoriesPage.checkSearch();
  }

  @Then("User see that category is displayed")
  public void userSeeThatCategoryIsDisplayed() {
    Assert.assertTrue(categoriesPage.validatecheckSearch());
  }

  @And("User click create modifier button")
  public void userClickCreateModifierButton() {
    modifiersPage.clickCreateModifier();
  }

  @And("User input random modifier name on modifier name text field")
  public void userInputRandomModifierNameOnModifierNameTextField() {
    modifiersPage.inputModifierName();
  }

  @And("User click add or manage option button")
  public void userClickAddOrManageOptionButton() {
    modifiersPage.clickAddorManageItem();
  }

  @And("User click add option button")
  public void userClickAddOptionButton() {
    modifiersPage.clickAddOption();
  }

  @And("User input option name {string} on name text field")
  public void userInputOptionNameOnNameTextField(String Keyword) {
    modifiersPage.inputOptionName(Keyword);
  }

  @And("User input option price on price text field")
  public void userInputOptionPriceOnPriceTextField() {
    modifiersPage.inputOptionPrice();
  }

  @And("User click save button on add option page")
  public void userClickSaveButtonOnAddOptionPage() {
    modifiersPage.clickSaveOption();
  }

  @And("User click save button on create modifier page")
  public void userClickSaveButtonOnCreateModifierPage() {
    modifiersPage.clickSaveModifier();
  }

  @Then("User see the modifier has been created")
  public void userSeeTheModifierHasBeenCreated() {
    modifiersPage.validateModifier();
  }

  @And("User click create item button on item library page")
  public void userClickCreateItemButtonOnItemLibraryPage() {
    itemLibraryPage.clickCreateItem();
  }

  @And("User input random item name on item name text field")
  public void userInputRandomItemNameOnItemNameTextField() {
    itemLibraryPage.inputItemName();
  }

  @And("User click add variant button")
  public void userClickAddVariantButton() {
    itemLibraryPage.addVariant();
  }

  @And("User input variant name {string} on name text field")
  public void userInputVariantNameOnNameTextField(String Keyword) {
    itemLibraryPage.addVariantName(Keyword);
  }

  @And("User input random price on price text field")
  public void userInputRandomPriceOnPriceTextField() {
    itemLibraryPage.inputPrice();
  }

  @And("User input random SKU on SKU text field")
  public void userInputRandomSKUOnSKUTextField() {
    itemLibraryPage.inputSKU();
  }

  @And("User click confirm button")
  public void userClickConfirmButton() {
    itemLibraryPage.clickConfirmAddVariant();
  }

  @And("User click modifier name {string}")
  public void userClickModifierName(String Keyword) {
    itemLibraryPage.addModifier(Keyword);
  }

  @And("User input random item description")
  public void userInputRandomItemDescription() {
    itemLibraryPage.addItemDescription();
  }

  @And("User click save button on create item page")
  public void userClickSaveButtonOnCreateItemPage() {
    itemLibraryPage.clickSaveItem();
  }

  @Then("User see the item has been created")
  public void userSeeTheItemHasBeenCreated() {
    itemLibraryPage.validateItemLibrary();
  }
}
