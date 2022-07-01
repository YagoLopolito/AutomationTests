package com.qaprosoft.carina.demo.gui.pages.google;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends AbstractPage {

    @FindBy(xpath = "//input[@title='Buscar']")
    private ExtendedWebElement searchBar;
    @FindBy(xpath = "//div[@class='CqAVzb lJ9FBc']//input[@name='btnK']")
    private ExtendedWebElement searchButton;
    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']")
    private ExtendedWebElement luckyButton;


    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public void loadPage() {
        getDriver().get("https://www.google.com");
    }
    public void searchWithDataProviders(String phrase){
        searchBar.click();
        searchBar.type(phrase);
        searchButton.click();
    }
}
