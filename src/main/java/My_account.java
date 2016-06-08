import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sgupta on 5/31/2016.
 */
public class My_account {

WebDriver driver;


        @FindBy(className = "RTL")
        private WebElement Welcome_Message;

        public My_account(WebDriver webDriver) {
            this.driver=driver;
            PageFactory.initElements(webDriver, this);
        }
public void welcome_message()
{
    String actual=this.Welcome_Message.getText();
    System.out.println(actual);
    Assert.assertEquals("Hi, Shikha Bansal", actual);

    //Assertion for URL



}


    }



