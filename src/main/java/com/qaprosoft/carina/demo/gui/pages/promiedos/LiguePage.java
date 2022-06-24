package com.qaprosoft.carina.demo.gui.pages.promiedos;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LiguePage extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"flechaad\"]")
    private ExtendedWebElement nextGame;
    @FindBy(xpath = "//*[@id=\"flechaatr\"]")
    private ExtendedWebElement lastGame;
    @FindBy(xpath = "//*[@id=\"accordian\"]/ul/li[3]/ul/li[7]/a")
    private ExtendedWebElement tittlesButton;


    public LiguePage(WebDriver driver) {
        super(driver);
    }

    public void NextGameClick(){
        nextGame.click();
    }
    public void LastGameClick(){
       lastGame.click();
    }
    public void TittlesButtonClick(){
       tittlesButton.click();
    }


}
