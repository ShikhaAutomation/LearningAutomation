import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by sgupta on 6/2/2016.
 */
public class Hotel_PO {

    WebDriver webdriver;

    @FindBy(css = ".navbar-collapse.collapse > ul > li:nth-of-type(2) > a")
    private WebElement Hotels_tab_in_header;
    @FindBy(xpath="html/body/div[17]/div/input")
    private WebElement Search_hotel;
    @FindBy(name = "checkout")
    private WebElement check_out;

    @FindBy(name = "checkin")
    private WebElement check_in;

    @FindBy(xpath = "html/body/div[5]/form/div[7]/div/button")
    private WebElement search_hotel_button;

    @FindBy(name = "child")
    private WebElement child_number;

    @FindBy(id = "adults")
    private WebElement adult_number;

    public Hotel_PO(WebDriver driver)
    {
        this.webdriver=driver;
        PageFactory.initElements(driver,this);
    }


    public void hotel_tab()
    {
        this.Hotels_tab_in_header.click();
    }

public void searchlocation(WebDriver driver)
{




}

}
