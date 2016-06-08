import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sgupta on 5/30/2016.
 */
public class Travel_Register_PageFactory {

    WebDriver driver;



    @FindBy(xpath = ".//*[@id='top']/div[1]/div/div/div[2]/ul/li[9]/ul/li[2]/a")
    WebElement Signin;

 public Travel_Register_PageFactory() {
     this.driver = driver;
 }




   public void signin()
   {
       Signin.click();

    }





}
