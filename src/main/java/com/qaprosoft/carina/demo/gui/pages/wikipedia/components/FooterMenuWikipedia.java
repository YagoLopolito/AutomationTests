package com.qaprosoft.carina.demo.gui.pages.wikipedia.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FooterMenuWikipedia extends AbstractPage {
    @FindBy(xpath = "//a[@title='m:Privacy policy/es']")
    private ExtendedWebElement politicsButton;
    @FindBy(xpath = "//a[@title='Wikipedia:Acerca de']")
    private ExtendedWebElement moreInfoButton;
    @FindBy(xpath = "//a[normalize-space()='Estadísticas']")
    private ExtendedWebElement statisticsButton;
    @FindBy(xpath = "//img[@alt='Wikimedia Foundation']")
    private ExtendedWebElement wkFoundationButton;

    public FooterMenuWikipedia(WebDriver driver) {
        super(driver);
    }
    public void UIComponents(){
        politicsButton.click();
        driver.navigate().back();
        moreInfoButton.click();
        driver.navigate().back();
        statisticsButton.click();
        driver.navigate().back();
        wkFoundationButton.click();
    }

}
