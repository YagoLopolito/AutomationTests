package com.qaprosoft.carina.demo.gui.pages.wikipedia;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class WikipediaHomePage extends AbstractPage {

    @FindBy(xpath = "//input[@id='searchInput']")
    private ExtendedWebElement searchBar;
    public WikipediaHomePage(WebDriver driver) {
        super(driver);
    }
    public void LoadPage() {
        getDriver().get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    }

}
