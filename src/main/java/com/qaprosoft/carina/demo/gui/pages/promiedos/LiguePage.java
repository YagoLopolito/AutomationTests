package com.qaprosoft.carina.demo.gui.pages.promiedos;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LiguePage extends AbstractPage {
    @FindBy(xpath = "//div[@id='flechaad']//img")
    private ExtendedWebElement nextGame;
    @FindBy(xpath = "//div[@id='flechaatr']//img")
    private ExtendedWebElement lastGame;
    @FindBy(xpath = "//div[@idb='historialtorneos']")
    private ExtendedWebElement tittlesButton;


    public LiguePage(WebDriver driver) {
        super(driver);
    }

    public void NextGameClick() {
        nextGame.click();
    }

    public void LastGameClick() {
        lastGame.click();
    }

    public void TittlesButtonClick() {
        tittlesButton.click();
    }


}
