package utils;

import org.openqa.selenium.WebDriver;
import pages.AddRemoveElementsPage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected AddRemoveElementsPage addRemoveElements = new AddRemoveElementsPage(driver);
}
