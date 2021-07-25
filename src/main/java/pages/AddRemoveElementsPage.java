package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddRemoveElementsPage{

    private final WebDriver driver;

    public AddRemoveElementsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using="Add Element")
    private static WebElement btnAddElement;

    @FindBy(how = How.LINK_TEXT, using="Delete")
    private static WebElement btnDeleteElement;

    public void goToThePage(){
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    public void clickOnAddElement(int clicks){
        for(int i=1;i<clicks;i++){
            btnAddElement.click();
        }
    }

    public void clickOnDeleteElement(int quantityRemove){
        List<WebElement> list = (List<WebElement>) btnDeleteElement;

        for(int i=1;i<quantityRemove;i++){
            list.get(i-1).click();
        }
    }
    
    public boolean validateAddElement(int clicks){
        List<WebElement> list = (List<WebElement>) btnDeleteElement;

        if (list.size() == clicks){
            return true;
        }else{
            return false;
        }
    }

}
