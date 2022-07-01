package com.qaprosoft.carina.demo.gui.pages.google;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class GoogleSecondPage extends AbstractPage {
    @FindBy(xpath = "//h3[contains(text(),'Ailuropoda melanoleuca - Wikipedia, la enciclopedi')]")
    private ExtendedWebElement pageOne;


    public GoogleSecondPage(WebDriver driver) {
        super(driver);
    }
    public void pageOne(){
        pageOne.click();
    }
}
