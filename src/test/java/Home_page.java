
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by sgupta on 5/30/2016.
 */
public class Home_page {

    @Test
    public void Login() {
        WebDriver driver = new FirefoxDriver();

        // URL
        String expected_url = "http://phptravels.net/";

        // Maximize Screen
        driver.manage().window().maximize();
        // Open URL
        driver.get(expected_url);

        // Get open URL
        String current_url = driver.getCurrentUrl();
        // Verify both are same
        Assert.assertEquals(expected_url, current_url);

        Travel_Register_PageFactory object = PageFactory.initElements(driver, Travel_Register_PageFactory.class);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Mouse Hover
        Actions actions = new Actions(driver);
        WebElement Myaccount = driver.findElement(By.cssSelector("a.show-submenu"));
        actions.moveToElement(Myaccount).perform();
        // click sign in
        object.signin();
        // Get title for register page
        String title = driver.getTitle();
        // Verify its regiter page or not
        Assert.assertEquals("Register", title);

        Register_PO regiter = new Register_PO(driver);
        // Registration Details
        regiter.setName("Shikha");
        regiter.setLastname("Bansal");
        regiter.setMobileNumber("017635555");
        regiter.setEmail("b1@example.com");
        //String randomemail;
        String randomemail = String.format("%s@example.com", RandomStringUtils.randomAlphabetic(5).toLowerCase());
        // regiter.setEmail(randomemail);
// String randompassword= RandomStringUtils.randomAlphanumeric(10);
        regiter.setPassword("password");
        regiter.setConfirmpassword("password");
        regiter.signButton();
        // Question is after sign -> directd to account then why i am getting register if i do assertion before calling account class method.
        My_account account = new My_account(driver);
        account.welcome_message();
        String expcted_url = "http://phptravels.net/account/";
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(expcted_url, actual_url);
    }


}
