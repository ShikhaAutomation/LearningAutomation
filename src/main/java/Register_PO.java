import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sgupta on 5/30/2016.
 */
public class Register_PO {

    WebDriver driver;

    @FindBy(name="firstname")
    WebElement Name;
    @FindBy(name="lastname")
    WebElement Lastname;
    @FindBy(name = "phone")
    WebElement MobileNumber;
    @FindBy(name="email")
    WebElement email;
    @FindBy(name="password")
    WebElement password;
    @FindBy(name="confirmpassword")
    WebElement confirmpassword;
    @FindBy(css = "#headersignupform > div:nth-of-type(9) > button")
    WebElement SignButton;

    public Register_PO(WebDriver webDriver)
    {
       this.driver=webDriver;
        PageFactory.initElements(driver,this);

    }


    public void setName(String name)
    {
        this.Name.clear();
        this.Name.sendKeys(name);
    }
public void setLastname(String lastname)
{
    this.Lastname.clear();
    this.Lastname.sendKeys(lastname);
}

public void setMobileNumber(String mobile)
{
    this.MobileNumber.clear();
    this.MobileNumber.sendKeys(mobile);
}

public void setEmail(String randomEmail)
{
    this.email.clear();
    this.email.sendKeys(randomEmail);


}

public void setPassword(String password)
{
    this.password.clear();
    this.password.sendKeys(password);
}
public void setConfirmpassword(String confrmpassword)
{
    this.confirmpassword.clear();
    this.confirmpassword.sendKeys(confrmpassword);
}

    public My_account signButton()
    {
        this.SignButton.click();
       return new My_account(this.driver);

    }
}
