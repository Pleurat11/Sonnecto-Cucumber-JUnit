import com.sonnecto.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;

public class MyStepdefs {
    WhmPage whmPage = new WhmPage();

    @Given("User sends {string} to link")
    public void userSendsToLink(String URL) {
        Driver.getDriver().get(URL);
    }

    @And("User send {string} to username field")
    public void userSendToUsernameField(String username) {
        whmPage.userName.sendKeys(username);
    }

    @And("User send {string} to Password field")
    public void userSendToPasswordField(String password) {
        whmPage.password.sendKeys(password + Keys.ENTER);
    }


    @Given("User sends {string} to link")
    public void user_sends_to_link(String URL) {
        Driver.getDriver().get(URL);
        throw new io.cucumber.java.PendingException();
    }
    @Given("User send {string} to username field")
    public void user_send_to_username_field(String username) {
        whmPage.userName.sendKeys(username);
    }
    @Given("User send {string} to Password field")
    public void user_send_to_password_field(String password) {
        whmPage.password.sendKeys(password + Keys.ENTER);
    }
}
