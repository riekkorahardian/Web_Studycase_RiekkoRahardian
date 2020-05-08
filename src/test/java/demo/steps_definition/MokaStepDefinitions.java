package demo.steps_definition;

import demo.pages.StartPage;
import demo.pages.pos.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitions {

 StartPage startPage = new StartPage();
 SignInPage signInPage = new SignInPage();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

    @And("User input email {string} on username text field")
    public void userInputEmailOnUsernameTextField(String Keyword) {
    signInPage.inputUsername(Keyword);

    }
}
